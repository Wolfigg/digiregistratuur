package ee.digiregistratuur.projekt.domain.questionaryquestion;

import ee.digiregistratuur.projekt.domain.disease.Disease;
import ee.digiregistratuur.projekt.domain.disease.DiseaseRepository;
import ee.digiregistratuur.projekt.domain.patient.Patient;
import ee.digiregistratuur.projekt.domain.patient.PatientRepository;
import ee.digiregistratuur.projekt.domain.questionary.Questionary;
import ee.digiregistratuur.projekt.domain.questionary.QuestionaryRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;

@Service
public class QuestionaryQuestionService {
    @Resource
    private QuestionaryQuestionRepository questionaryQuestionRepository;

    @Resource
    private QuestionaryQuestionMapper questionaryQuestionMapper;

    @Resource
    private QuestionaryRepository questionaryRepository;

    @Resource
    private PatientRepository patientRepository;

    @Resource
    private DiseaseRepository diseaseRepository;

    public DiseaseQuestionaryResponse getAllQuestionsByDiseaseId(Integer diseaseId, Integer patientId) {
        Disease disease = diseaseRepository.getById(diseaseId);
        Patient patient = patientRepository.getById(patientId);


        Questionary questionary = new Questionary();
        questionary.setDisease(disease);
        questionary.setPatient(patient);
        questionary.setStatus("pending2");
        questionary.setDate(LocalDate.now());
        questionaryRepository.save(questionary);



        List<QuestionaryQuestion> questions = questionaryQuestionRepository.findByDiseaseId(diseaseId);
        List<QuestionDto> questionDtos = questionaryQuestionMapper.toQuestionsResponses(questions);

        DiseaseQuestionaryResponse response = new DiseaseQuestionaryResponse();
        response.setQuestionaryId(questionary.getId());
        response.setQuestionDtos(questionDtos);


        return response;
    }
}

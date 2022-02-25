package ee.digiregistratuur.projekt.domain.disease;

import ee.digiregistratuur.projekt.domain.questionaryquestion.QuestionaryQuestionRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DiseaseService {

    @Resource
    private DiseaseRepository diseaseRepository;

    @Resource
    private DiseaseMapper diseaseMapper;

    @Resource
    QuestionaryQuestionRepository questionaryQuestionRepository;


    public List<DiseaseResponse> getDiseaseList() {
        List<Disease> diseases = diseaseRepository.findAll();
        List<DiseaseResponse> responses = diseaseMapper.diseasesToDiseaseResponses(diseases);
        return responses;
    }

    public void addNewDisease(DiseaseRequest diseaseRequest) {
        Disease newDisease = diseaseMapper.diseaseRequestToDisease(diseaseRequest);
        diseaseRepository.save(newDisease);
    }

//    public void deleteDisease(Integer id) {
//        List<QuestionaryQuestion> questionsByDiseaseId = questionaryQuestionRepository.findQuestionsByDiseaseId(id);
//
//    }
}

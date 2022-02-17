package ee.digiregistratuur.projekt.domain.disease;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DiseaseService {

    @Resource
    private DiseaseRepository diseaseRepository;

    @Resource
    private DiseaseMapper diseaseMapper;

    public List<DiseaseResponse> getDiseaseList() {
        List<Disease> diseases = diseaseRepository.findAll();
        List <DiseaseResponse> responses = diseaseMapper.diseaseToDiseaseResponse(diseases);
        return responses;
    }
}

package ee.digiregistratuur.projekt.domain.disease;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface DiseaseMapper {
//    Disease diseaseDtoToDisease(DiseaseDto diseaseDto);
//
//    DiseaseDto diseaseToDiseaseDto(Disease disease);
//
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    void updateDiseaseFromDiseaseDto(DiseaseDto diseaseDto, @MappingTarget Disease disease);


    Disease diseaseResponseToDisease(DiseaseResponse diseaseResponse);

    List<DiseaseResponse> diseaseToDiseaseResponse(List<Disease> disease);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateDiseaseFromDiseaseResponse(DiseaseResponse diseaseResponse, @MappingTarget Disease disease);
}

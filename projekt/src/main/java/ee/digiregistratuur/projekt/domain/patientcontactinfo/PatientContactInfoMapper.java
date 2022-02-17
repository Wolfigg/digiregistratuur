package ee.digiregistratuur.projekt.domain.patientcontactinfo;

import ee.digiregistratuur.projekt.service.login.LogInResponse;
import ee.digiregistratuur.projekt.service.updatecontact.UpdateContactRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PatientContactInfoMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updatePatientContactInfoFromPatientContactInfoDto(PatientContactInfoDto patientContactInfoDto, @MappingTarget PatientContactInfo patientContactInfo);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateFromRequestToEntity(UpdateContactRequest request, @MappingTarget PatientContactInfo entity);

    @Mapping(target = "idCode", source = "patient.idCode")
    LogInResponse mapInfoToResponse(PatientContactInfo info);

}

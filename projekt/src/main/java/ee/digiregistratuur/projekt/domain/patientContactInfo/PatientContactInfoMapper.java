package ee.digiregistratuur.projekt.domain.patientContactInfo;

import ee.digiregistratuur.projekt.service.login.ContactInfoResponse;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PatientContactInfoMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updatePatientContactInfoFromPatientContactInfoDto(PatientContactInfoDto patientContactInfoDto, @MappingTarget PatientContactInfo patientContactInfo);

    @Mapping(target = "idCode", source = "patient.idCode")
    ContactInfoResponse mapInfoToResponse(PatientContactInfo info);


}


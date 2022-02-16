package ee.digiregistratuur.projekt.PatientContactInfo;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PatientContactInfoMapper {
    PatientContactInfo patientContactInfoDtoToPatientContactInfo(PatientContactInfoDto patientContactInfoDto);

    PatientContactInfoDto patientContactInfoToPatientContactInfoDto(PatientContactInfo patientContactInfo);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updatePatientContactInfoFromPatientContactInfoDto(PatientContactInfoDto patientContactInfoDto, @MappingTarget PatientContactInfo patientContactInfo);

    PatientContactInfo patientContactInfoDto1ToPatientContactInfo(PatientContactInfoDtoRequest patientContactInfoDto1);

    PatientContactInfoDtoRequest patientContactInfoToPatientContactInfoDto1(PatientContactInfo patientContactInfo);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updatePatientContactInfoFromPatientContactInfoDtoRequest(PatientContactInfoDtoRequest patientContactInfoDtoRequest, @MappingTarget PatientContactInfo patientContactInfo);
}


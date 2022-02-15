package ee.digiregistratuur.projekt.patient;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PatientMapper {
    Patient patientDtoToPatient(PatientDto patientDto);

    PatientDto patientToPatientDto(Patient patient);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updatePatientFromPatientDto(PatientDto patientDto, @MappingTarget Patient patient);
}

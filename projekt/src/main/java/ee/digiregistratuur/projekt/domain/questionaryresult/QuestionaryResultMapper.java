package ee.digiregistratuur.projekt.domain.questionaryresult;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface QuestionaryResultMapper {
    QuestionaryResult questionaireResultDtoToQuestionaireResult(QuestionaryResultDto questionaryResultDto);

    QuestionaryResultDto questionaireResultToQuestionaireResultDto(QuestionaryResult questionaryResult);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateQuestionaireResultFromQuestionaireResultDto(QuestionaryResultDto questionaryResultDto, @MappingTarget QuestionaryResult questionaryResult);
}

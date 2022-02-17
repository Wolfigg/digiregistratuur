package ee.digiregistratuur.projekt.domain.questionaireresult;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface QuestionaireResultMapper {
    QuestionaireResult questionaireResultDtoToQuestionaireResult(QuestionaireResultDto questionaireResultDto);

    QuestionaireResultDto questionaireResultToQuestionaireResultDto(QuestionaireResult questionaireResult);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateQuestionaireResultFromQuestionaireResultDto(QuestionaireResultDto questionaireResultDto, @MappingTarget QuestionaireResult questionaireResult);
}

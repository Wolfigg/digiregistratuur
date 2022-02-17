package ee.digiregistratuur.projekt.domain.questionaryquestion;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface QuestionaryQuestionMapper {
//    QuestionaireQuestion questionaireQuestionDtoToQuestionaireQuestion(QuestionaireQuestionDto questionaireQuestionDto);
//
//    QuestionaireQuestionDto questionaireQuestionToQuestionaireQuestionDto(QuestionaireQuestion questionaireQuestion);
//
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    void updateQuestionaireQuestionFromQuestionaireQuestionDto(QuestionaireQuestionDto questionaireQuestionDto, @MappingTarget QuestionaireQuestion questionaireQuestion);
//
//    QuestionaireQuestion questionaireQuestionResponseToQuestionaireQuestion(QuestionaireQuestionResponse questionaireQuestionResponse);
//
//    QuestionaireQuestionResponse questionaireQuestionToQuestionaireQuestionResponse(QuestionaireQuestion questionaireQuestion);
//
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    void updateQuestionaireQuestionFromQuestionaireQuestionResponse(QuestionaireQuestionResponse questionaireQuestionResponse, @MappingTarget QuestionaireQuestion questionaireQuestion);


    @Mapping(target = "diseaseId", source = "disease.id")
    QuestionaryQuestionResponse toQuestionsResponse(QuestionaryQuestion questions);

    List<QuestionaryQuestionResponse> toQuestionsResponses(List<QuestionaryQuestion> question);

}


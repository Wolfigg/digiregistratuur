package ee.digiregistratuur.projekt.domain.questionaryquestion;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface QuestionaryQuestionMapper {

//
//    QuestionaireQuestionDto questionaireQuestionToQuestionaireQuestionDto(QuestionaryQuestion questionaryQuestion);
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


    @Mapping(target = "questionId", source = "id")
    QuestionDto toQuestionsResponse(QuestionaryQuestion questions);

    List<QuestionDto> toQuestionsResponses(List<QuestionaryQuestion> question);

    QuestionaryQuestion questionDtoToQuestion(RequestAddQuestion requestAddQuestion);
}


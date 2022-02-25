package ee.digiregistratuur.projekt.domain.questionaryanswer;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface QuestionaryAnswerMapper {


    QuestionaryAnswer toQuestionaryAnswer(QuestionaryAnswerDto questionaryAnswerDto);

    QuestionaryAnswerDto questionaryAnswerToQuestionaryAnswerDto(QuestionaryAnswer questionaryAnswer);

//    @Mapping(target = "questionaryId", source = "responseByDisease.questionaryId")
//    QuestionaryAnswer toQuestionaryAnswer(ResponseByDisease responseByDisease);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateQuestionaryAnswerFromQuestionaryAnswerDto(QuestionaryAnswerDto questionaryAnswerDto, @MappingTarget QuestionaryAnswer questionaryAnswer);
}

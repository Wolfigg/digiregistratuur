package ee.digiregistratuur.projekt.domain.questionary;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface QuestionaryMapper {
    Questionary questionaryDtoToQuestionary(QuestionaryDto questionaryDto);

    QuestionaryDto questionaryToQuestionaryDto(Questionary questionary);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateQuestionaryFromQuestionaryDto(QuestionaryDto questionaryDto, @MappingTarget Questionary questionary);
}

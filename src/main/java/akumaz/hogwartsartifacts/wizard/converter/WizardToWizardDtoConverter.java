package akumaz.hogwartsartifacts.wizard.converter;

import akumaz.hogwartsartifacts.wizard.Wizard;
import akumaz.hogwartsartifacts.wizard.dto.WizardDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class WizardToWizardDtoConverter implements Converter<Wizard, WizardDto> {
    @Override
    public WizardDto convert(Wizard source) {
        WizardDto wizardDto = new WizardDto(source.getId(),
                                    source.getName(),
                                    source.getNumberOfArtifacts());
        return wizardDto;
    }
}

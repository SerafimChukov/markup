package markup;

import java.util.List;

public class Emphasis extends AbstractContent implements MarkableElement {
    public Emphasis(List<MarkableElement> content) {
        super(content);
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        toMarkdown(sb, "*");
    }

    @Override
    public void toBBCode(StringBuilder sb) {
        toBBCode(sb, "[i]", "[/i]");
    }
}

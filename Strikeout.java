package markup;

import java.util.List;

public class Strikeout extends AbstractContent implements MarkableElement {
    public Strikeout(List<MarkableElement> content) {
        super(content);
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        toMarkdown(sb, "~");
    }

    @Override
    public void toBBCode(StringBuilder sb) {
        toBBCode(sb, "[s]", "[/s]");
    }
}
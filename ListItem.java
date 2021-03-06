package markup;

import java.util.List;

public class ListItem extends AbstractContent {
    public ListItem(List<ItemableElement> content) {
        super(content);
    }

    @Deprecated
    @Override
    public void toMarkdown(StringBuilder sb) {
    }

    @Override
    public void toBBCode(StringBuilder sb) {
        toBBCode(sb, "[*]", "[/*]");
    }
}
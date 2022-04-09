package markup;

public class Text implements MarkableElement {
    final private String element;

    public Text(String s) {
        this.element = s;
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        sb.append(element);
    }

    @Override
    public void toBBCode(StringBuilder sb) {
        sb.append(element);
    }
}
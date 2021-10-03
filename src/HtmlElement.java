import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HtmlElement{
    public String name,text;
    public List<HtmlElement> elements= new ArrayList<>();
    private final int indentSize=2;
    private final String newLine=System.lineSeparator();
    private StringBuilder sb=new StringBuilder();

    public HtmlElement() {
    }

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    private String toStringImpl(int indent) {

        sb.append("<"+this.name +">"+ newLine);

        for (HtmlElement e : elements) {

            sb.append(String.join("", Collections.nCopies(indentSize, " ") )+"<"+e.name +">"+ newLine )
                    .append(String.join("",Collections.nCopies(indentSize+1, " ") ) +e.text + newLine)
                    .append(String.join("",Collections.nCopies(indentSize, " ") ) +"</"+e.name +">"+ newLine);}

        sb.append("</"+this.name +">"+ System.lineSeparator());
        return sb.toString();
    }

    public String toString(){
        return  toStringImpl(0);}
}
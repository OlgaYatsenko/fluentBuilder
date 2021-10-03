public class DemoBuilderExample {

    public static void main(String args[]){

    HtmlBuilder builder=new HtmlBuilder("ul");
        builder
            .addChild("li","hello")
            .addChild("li","how are you?");
    System.out.print(builder);


    }
}


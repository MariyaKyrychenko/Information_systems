public class Main {
 
    public static void main(String[] args) {
        HtmlTag parentTag = new HtmlParentElement("<form>");
        parentTag.setStartTag("<form>");
        parentTag.setEndTag("</form>");
         
        HtmlTag p1 = new HtmlParentElement("<select>");
        p1.setStartTag("<select>");
        p1.setEndTag("</select>");
        parentTag.addChildTag(p1);
         
        HtmlTag child1 = new HtmlElement("<option>");
        child1.setStartTag("<option value = 'Option_1'>");
        child1.setEndTag("</option>");
        child1.setTagBody("Option_1");
        p1.addChildTag(child1);
         
        child1 = new HtmlElement("<option>");
        child1.setStartTag("<option value = 'Option_1'>");
        child1.setEndTag("</option>");
        child1.setTagBody("Option_2");
        p1.addChildTag(child1);
        
        HtmlTag p2 = new HtmlParentElement("<input>");
        p2.setStartTag("<input type = ''>");
        parentTag.addChildTag(p2);
        
        HtmlTag p3 = new HtmlParentElement("<fieldset>");
        p3.setStartTag("<fieldset>");
        p3.setEndTag("</fieldset>");
        parentTag.addChildTag(p3);
        
        HtmlTag child2 = new HtmlElement("<input>");
        child2.setStartTag("<input type = ''>");
        p3.addChildTag(child2);
        
        child2 = new HtmlElement("<input>");
        child2.setStartTag("<input type = ''>");
        p3.addChildTag(child2);
         
        parentTag.generateHtml();
         
    }
 
}
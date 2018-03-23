import static spark.Spark.*;

public class Main {
	 /** Usage: java -cp "*" StanfordCoreNlpDemo [inputFile [outputTextFile [outputXmlFile]]] */
	  public static void main(String[] args)  {
		Sentiment.init();
		
		try{
			get("/sentiment/:name", (request, response) -> {
			    return "Sentiment: " + Sentiment.findSentiment(request.params(("name")));
			});
			
			post("/sentiment/:name", (request, response) -> {
				return "Sentiment: " + Sentiment.findSentiment(request.params(("name")));
			});
			
		}catch(Exception e){
			e.printStackTrace();
		}
	  }
}
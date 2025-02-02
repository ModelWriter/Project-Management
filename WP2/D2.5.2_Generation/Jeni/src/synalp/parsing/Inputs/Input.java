package synalp.parsing.Inputs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import synalp.parsing.ParseResult;
import weka.core.Instance;
import weka.core.Instances;

public class Input {

	private Sentence sentence;
	private ArrayList<ParseResult> parseResults = new ArrayList<ParseResult>();
	private Set<String> newLexicalItemsProposed = new HashSet<String>();
	private boolean parseSuccess;
	private String parseMessage;
	private boolean resultsTypeComplete;
	private int parseCount = 0;

	
	private Instances mlInstances;
	
	
	
	public Input(Sentence sent) {
		this.sentence = sent;
		this.mlInstances = null;
		this.parseMessage = "Unkown; not logged";
	}

	public Sentence getSentence() {
		return sentence;
	}

	public ArrayList<ParseResult> getParseResults() {
		return parseResults;
	}
	

	public void setParseResult(ArrayList<ParseResult> parseResults) {
		this.parseResults = parseResults;
		if (parseResults.size()>0) {
			parseCount = parseResults.size();
			parseSuccess = true;
			// Results (one or more) of only one type are present -- either they are all of type Complete or of type Incomplete. Checking for the type of the first result suffices.
			ParseResult firstResult = parseResults.get(0);
			if (firstResult.isResultTypeComplete()) {
				resultsTypeComplete = true;
			}
			else {
				resultsTypeComplete = false;
			}
		}
	}

	public Set<String> getNewLexicalItemsProposed() {
		return newLexicalItemsProposed;
	}

	public void setNewLexicalItemsProposed(Set<String> newLexicalItemsProposed) {
		this.newLexicalItemsProposed = newLexicalItemsProposed;
	}
	
	public boolean isParseSuccess() {
		return parseSuccess;
	}
	
	public int getParseCount() {
		return parseCount;
	}
	
	public boolean areResultsTypeComplete() {
		return resultsTypeComplete;
	}
	
	public String getMLDataString(){
		StringBuilder x = new StringBuilder("");
		for (Instance inst:mlInstances) {
			x.append(inst.toString()+"\n");
		}
		return x.toString();
	}
	
	public void setMLInstances(Instances mlInstances) {
		this.mlInstances = mlInstances;
	}
	
	public Instances getMLInstances() {
		return mlInstances;
	}
	
	public void setParseMessage(String message) {
		this.parseMessage = message;
	}
	
	public String getParseMessage() {
		return parseMessage;
	}
	
}

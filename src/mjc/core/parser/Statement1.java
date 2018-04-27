package mjc.core.parser;

import mjc.core.parser.interfaces.IStatement;
import mjc.core.parser.interfaces.IStatmentPrime;

public class Statement1 implements IStatement{

	//Statement ::= �{� Statement` �}�
	IStatmentPrime statementPrime;
	
	public Statement1(IStatmentPrime statementPrime) {
		super();
		this.statementPrime = statementPrime;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return "{"+(statementPrime!=null? statementPrime.getValue(): "statementPrime==null")+"}";
	}

}

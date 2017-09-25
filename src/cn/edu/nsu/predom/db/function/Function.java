/**
 * 
 */
package cn.edu.nsu.predom.db.function;

/**
 * @author ���Ƕ�
 *
 */
public class Function {
	private int function_id;
	private String function_name;
	private String function_note;
	/**
	 * @return the function_id
	 */
	public int getFunction_id() {
		return function_id;
	}
	/**
	 * @param functionId the function_id to set
	 */
	public void setFunction_id(int functionId) {
		function_id = functionId;
	}
	/**
	 * @return the function_name
	 */
	public String getFunction_name() {
		return function_name;
	}
	/**
	 * @param functionName the function_name to set
	 */
	public void setFunction_name(String functionName) {
		function_name = functionName;
	}
	/**
	 * @return the function_note
	 */
	public String getFunction_note() {
		return function_note;
	}
	/**
	 * @param functionNote the function_note to set
	 */
	public void setFunction_note(String functionNote) {
		function_note = functionNote;
	}
	
	public String toString(){
		return function_id+"\t"+function_name+"\t"+function_note;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Function)
		{
			return ((Function)obj).getFunction_id() == function_id;
		}
	    return false;
	}

}

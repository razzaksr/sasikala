package forms.model.demo;

import java.beans.PropertyEditorSupport;

public class MilageEditor extends PropertyEditorSupport
{
	@Override
	public void setAsText(String text) throws IllegalArgumentException 
	{
		//System.out.println(text);
		// TODO Auto-generated method stub
		if(text.equals("")||text.equals(" ")||text==null)
		{
			text=""+40;
			setValue(text);
		}
	}
}

public class Procedure 
{
    String procedureName;
    String procedureDate;
    String procedurePractitioner;
    Double procedureCharges;
    
    public Procedure(String theName,String theDate,String thePractitioner,double theCharges)
    {
        procedureName = theName;
        procedureDate = theDate;
        procedurePractitioner = thePractitioner;
        procedureCharges = theCharges;
    }

    public void setProcedureName(String theName)
    {
        procedureName = theName;
    }
    public void setProcedureDate(String theDate)
    {
        procedureDate = theDate;
    }
    public void setProcedurePractitioner(String practitionerName)
    {
        procedurePractitioner = practitionerName;
    }
    public void setProcedureCharges(Double theCharges)
    {
        procedureCharges = theCharges;
    }

    public String getProcedureName()
    {
        return procedureName;
    }
    public String getProcedureDate()
    {
        return procedureDate;
    }
    public String getProcedurePractitioner()
    {
        return procedurePractitioner;
    }
    public double getprocedureCharges()
    {
        return procedureCharges;
    }
}

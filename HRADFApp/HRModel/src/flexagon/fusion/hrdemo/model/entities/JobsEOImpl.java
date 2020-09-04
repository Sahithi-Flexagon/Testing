package flexagon.fusion.hrdemo.model.entities;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Sep 20 17:26:00 CDT 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class JobsEOImpl
  extends EntityImpl
{
  /**
   * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
   */
  public enum AttributesEnum
  {
    JobId,
    JobTitle,
    MinSalary,
    MaxSalary,
    Employees,
    JobHistory;
    private static AttributesEnum[] vals = null;
    private static final int firstIndex = 0;

    public int index()
    {
      return AttributesEnum.firstIndex() + ordinal();
    }

    public static final int firstIndex()
    {
      return firstIndex;
    }

    public static int count()
    {
      return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
    }

    public static final AttributesEnum[] staticValues()
    {
      if (vals == null)
      {
        vals = AttributesEnum.values();
      }
      return vals;
    }
  }


  public static final int JOBID = AttributesEnum.JobId.index();
  public static final int JOBTITLE = AttributesEnum.JobTitle.index();
  public static final int MINSALARY = AttributesEnum.MinSalary.index();
  public static final int MAXSALARY = AttributesEnum.MaxSalary.index();
  public static final int EMPLOYEES = AttributesEnum.Employees.index();
  public static final int JOBHISTORY = AttributesEnum.JobHistory.index();

  /**
   * This is the default constructor (do not remove).
   */
  public JobsEOImpl()
  {
  }

  /**
   * @return the definition object for this instance class.
   */
  public static synchronized EntityDefImpl getDefinitionObject()
  {
    return EntityDefImpl.findDefObject("flexagon.fusion.hrdemo.model.entities.JobsEO");
  }


  /**
   * Gets the attribute value for JobId, using the alias name JobId.
   * @return the value of JobId
   */
  public String getJobId()
  {
    return (String) getAttributeInternal(JOBID);
  }

  /**
   * Sets <code>value</code> as the attribute value for JobId.
   * @param value value to set the JobId
   */
  public void setJobId(String value)
  {
    setAttributeInternal(JOBID, value);
  }

  /**
   * Gets the attribute value for JobTitle, using the alias name JobTitle.
   * @return the value of JobTitle
   */
  public String getJobTitle()
  {
    return (String) getAttributeInternal(JOBTITLE);
  }

  /**
   * Sets <code>value</code> as the attribute value for JobTitle.
   * @param value value to set the JobTitle
   */
  public void setJobTitle(String value)
  {
    setAttributeInternal(JOBTITLE, value);
  }

  /**
   * Gets the attribute value for MinSalary, using the alias name MinSalary.
   * @return the value of MinSalary
   */
  public Integer getMinSalary()
  {
    return (Integer) getAttributeInternal(MINSALARY);
  }

  /**
   * Sets <code>value</code> as the attribute value for MinSalary.
   * @param value value to set the MinSalary
   */
  public void setMinSalary(Integer value)
  {
    setAttributeInternal(MINSALARY, value);
  }

  /**
   * Gets the attribute value for MaxSalary, using the alias name MaxSalary.
   * @return the value of MaxSalary
   */
  public Integer getMaxSalary()
  {
    return (Integer) getAttributeInternal(MAXSALARY);
  }

  /**
   * Sets <code>value</code> as the attribute value for MaxSalary.
   * @param value value to set the MaxSalary
   */
  public void setMaxSalary(Integer value)
  {
    setAttributeInternal(MAXSALARY, value);
  }

  /**
   * @return the associated entity oracle.jbo.RowIterator.
   */
  public RowIterator getEmployees()
  {
    return (RowIterator) getAttributeInternal(EMPLOYEES);
  }

  /**
   * @return the associated entity oracle.jbo.RowIterator.
   */
  public RowIterator getJobHistory()
  {
    return (RowIterator) getAttributeInternal(JOBHISTORY);
  }

  /**
   * @param jobId key constituent

   * @return a Key object based on given key constituents.
   */
  public static Key createPrimaryKey(String jobId)
  {
    return new Key(new Object[] { jobId });
  }


}


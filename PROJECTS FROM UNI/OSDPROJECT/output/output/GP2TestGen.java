import java.io.*; 
import java.util.List; 
import java.util.Vector; 

public class GP2TestGen implements SystemTypes
{ public static final int dim = 5000;
  // Number of entities = dim, attributes = dim*dim

  public static void main(String[] args)
  { File file = new File("./gpdata" + dim + ".txt");
    try
    { PrintWriter out = new PrintWriter(
                              new BufferedWriter(
                                   new FileWriter(file)));
      writeModel(out); 
      out.close();
    }
    catch (IOException ex)
    { System.out.println("Error generating test"); } 
  } 


  public static void writeModel(PrintWriter out)
  { 
    for (int i = 0; i < dim; i++)
    { String cname = "patientGP" + i;
      out.println(cname  + " : PatientGP");
      out.println(cname + ".Id = \"" + i + "\"");
      out.println(cname + ".nhsNumber = \"" + cname + "\"");
      out.println(cname + ".name1 = \"" + cname + "\"");
      out.println(cname + ".name2 = \"" + cname + "\"");
      out.println(cname + ".dob = " + i);
      out.println(cname + ".addr1 = \"" + cname + "\"");
      out.println(cname + ".addr2 = \"" + cname + "\"");
      out.println(cname + ".postcode = \"" + cname + "\"");
      out.println(cname + ".isMale = false");
      String dname = "doctorGP" + i; 
      out.println(dname + " : Doctor"); 
      out.println(dname + ".staffNumber = \"" + i + "\""); 
      out.println(dname + ".name1 = \"" + dname + "\""); 
      out.println(dname + ".name2 = \"" + dname + "\""); 
      out.println(dname + ".surgery = \"mysurgery\""); 
      out.println(dname + " : " + cname + ".registeredWith"); 
      if (i % 2 == 0)
      { String consname = "consultation" + i; 
        out.println(consname + " : Consultation"); 
        out.println(consname + ".date = " + i); 
        out.println(consname + ".outcome = \"prescribed antidepressant\""); 
        out.println(consname + ".symptoms = \"general malaise\""); 
        out.println(consname + ".doctor = " + dname); 
        out.println(consname + " : " + cname + ".consultations"); 
      } 
      else 
      { String referralname = "referral" + i; 
        out.println(referralname + " : Referral"); 
        out.println(referralname + ".date = " + i); 
        out.println(referralname + ".referredTo = \"dietician\""); 
        out.println(referralname + ".referrer = " + dname); 
        out.println(referralname + " : " + cname + ".referrals"); 
      } 
    } 

    for (int i = 0; i < dim; i++)
    { String hname = "patientH" + i;
      String cname = "patientGP" + i;
      out.println(hname  + " : PatientH");
      out.println(hname + ".hospitalNumber = \"" + hname + "\"");
      out.println(hname + ".forename = \"" + cname + "\"");
      out.println(hname + ".surname = \"" + cname + "\"");
      out.println(hname + ".ageyrs = " + (i/12));
      out.println(hname + ".agemnths = " + (i % 12)); 
      out.println(hname + ".ward = \"" + hname + "\"");
      out.println(hname + ".bed = " + i);
      out.println(hname + ".inpatient = true");
      String dname = "clinician" + i; 
      out.println(dname + " : Clinician"); 
      out.println(dname + ".jobCode = \"" + i + "\""); 
      out.println(dname + ".name = \"" + dname + "\""); 
      out.println(dname + ".jobTitle = \"" + dname + "\""); 
      if (i % 2 == 0)
      { String tname = "treatment" + i; 
        out.println(tname + " : Treatment"); 
        out.println(tname + ".date = " + i); 
        out.println(tname + ".description = \"minor surgery\""); 
        out.println(dname + " : " + tname + ".clinicians"); 
        out.println(tname + " : " + hname + ".treatments"); 
      } 
      else 
      { String iname = "investigation" + i; 
        out.println(iname + " : Investigation"); 
        out.println(iname + ".description = \"ultrasound scan\""); 
        out.println(iname + ".result = \"normal\""); 
        out.println(dname + " : " + iname + ".clinicians"); 
        out.println(iname + " : " + hname + ".investigations"); 
      } 
    } 

  }
}
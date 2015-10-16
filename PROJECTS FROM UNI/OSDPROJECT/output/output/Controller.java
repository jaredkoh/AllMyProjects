import java.util.List;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.util.Vector;

import java.lang.*;
import java.lang.reflect.*;
import java.util.StringTokenizer;
import java.io.*;



class PatientGP
  implements SystemTypes
{
  private String Id = ""; // internal
  private String nhsNumber = ""; // internal
  private String name1 = ""; // internal
  private String name2 = ""; // internal
  private int dob = 0; // internal
  private String addr1 = ""; // internal
  private String addr2 = ""; // internal
  private String postcode = ""; // internal
  private boolean isMale = false; // internal
  private List registeredWith = new Vector(); // of Doctor
  private List consultations = new Vector(); // of Consultation
  private List referrals = new Vector(); // of Referral

  public PatientGP()
  {
    this.Id = "";
    this.nhsNumber = "";
    this.name1 = "";
    this.name2 = "";
    this.dob = 0;
    this.addr1 = "";
    this.addr2 = "";
    this.postcode = "";
    this.isMale = false;

  }



  public void setId(String Id_x) { Id = Id_x;  }


  public static void setAllId(List patientgps,String val)
{ for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      Controller.inst().setId(patientgpx,val); } }


  public void setnhsNumber(String nhsNumber_x) { nhsNumber = nhsNumber_x;  }


  public static void setAllnhsNumber(List patientgps,String val)
{ for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      Controller.inst().setnhsNumber(patientgpx,val); } }


  public void setname1(String name1_x) { name1 = name1_x;  }


  public static void setAllname1(List patientgps,String val)
{ for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      Controller.inst().setname1(patientgpx,val); } }


  public void setname2(String name2_x) { name2 = name2_x;  }


  public static void setAllname2(List patientgps,String val)
{ for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      Controller.inst().setname2(patientgpx,val); } }


  public void setdob(int dob_x) { dob = dob_x;  }


  public static void setAlldob(List patientgps,int val)
{ for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      Controller.inst().setdob(patientgpx,val); } }


  public void setaddr1(String addr1_x) { addr1 = addr1_x;  }


  public static void setAlladdr1(List patientgps,String val)
{ for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      Controller.inst().setaddr1(patientgpx,val); } }


  public void setaddr2(String addr2_x) { addr2 = addr2_x;  }


  public static void setAlladdr2(List patientgps,String val)
{ for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      Controller.inst().setaddr2(patientgpx,val); } }


  public void setpostcode(String postcode_x) { postcode = postcode_x;  }


  public static void setAllpostcode(List patientgps,String val)
{ for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      Controller.inst().setpostcode(patientgpx,val); } }


  public void setisMale(boolean isMale_x) { isMale = isMale_x;  }


  public static void setAllisMale(List patientgps,boolean val)
{ for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      Controller.inst().setisMale(patientgpx,val); } }


  public void setregisteredWith(List registeredWithxx) { registeredWith = registeredWithxx;
    }
 
  public void addregisteredWith(Doctor registeredWithxx) { registeredWith.add(registeredWithxx);
    }
 
  public void removeregisteredWith(Doctor registeredWithxx) { Vector _removedregisteredWithregisteredWithxx = new Vector();
  _removedregisteredWithregisteredWithxx.add(registeredWithxx);
  registeredWith.removeAll(_removedregisteredWithregisteredWithxx);
    }

  public static void setAllregisteredWith(List patientgps,List _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().setregisteredWith(patientgpx, _val); } }

  public static void addAllregisteredWith(List patientgps,Doctor _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().addregisteredWith(patientgpx, _val); } }


  public static void removeAllregisteredWith(List patientgps,Doctor _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().removeregisteredWith(patientgpx, _val); } }


  public static void unionAllregisteredWith(List patientgps, List _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().unionregisteredWith(patientgpx, _val); } }


  public static void subtractAllregisteredWith(List patientgps, List _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().subtractregisteredWith(patientgpx, _val); } }


  public void setconsultations(List consultationsxx) { consultations = consultationsxx;
    }
 
  public void addconsultations(Consultation consultationsxx) { consultations.add(consultationsxx);
    }
 
  public void removeconsultations(Consultation consultationsxx) { Vector _removedconsultationsconsultationsxx = new Vector();
  _removedconsultationsconsultationsxx.add(consultationsxx);
  consultations.removeAll(_removedconsultationsconsultationsxx);
    }

  public static void setAllconsultations(List patientgps,List _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().setconsultations(patientgpx, _val); } }

  public static void addAllconsultations(List patientgps,Consultation _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().addconsultations(patientgpx, _val); } }


  public static void removeAllconsultations(List patientgps,Consultation _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().removeconsultations(patientgpx, _val); } }


  public static void unionAllconsultations(List patientgps, List _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().unionconsultations(patientgpx, _val); } }


  public static void subtractAllconsultations(List patientgps, List _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().subtractconsultations(patientgpx, _val); } }


  public void setreferrals(List referralsxx) { referrals = referralsxx;
    }
 
  public void addreferrals(Referral referralsxx) { referrals.add(referralsxx);
    }
 
  public void removereferrals(Referral referralsxx) { Vector _removedreferralsreferralsxx = new Vector();
  _removedreferralsreferralsxx.add(referralsxx);
  referrals.removeAll(_removedreferralsreferralsxx);
    }

  public static void setAllreferrals(List patientgps,List _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().setreferrals(patientgpx, _val); } }

  public static void addAllreferrals(List patientgps,Referral _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().addreferrals(patientgpx, _val); } }


  public static void removeAllreferrals(List patientgps,Referral _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().removereferrals(patientgpx, _val); } }


  public static void unionAllreferrals(List patientgps, List _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().unionreferrals(patientgpx, _val); } }


  public static void subtractAllreferrals(List patientgps, List _val)
  { for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      Controller.inst().subtractreferrals(patientgpx, _val); } }


  public String getId() { return Id; }

  public static List getAllId(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      if (result.contains(patientgpx.getId())) { }
      else { result.add(patientgpx.getId()); } }
    return result; }

  public static List getAllOrderedId(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      result.add(patientgpx.getId()); } 
    return result; }

  public String getnhsNumber() { return nhsNumber; }

  public static List getAllnhsNumber(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      if (result.contains(patientgpx.getnhsNumber())) { }
      else { result.add(patientgpx.getnhsNumber()); } }
    return result; }

  public static List getAllOrderednhsNumber(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      result.add(patientgpx.getnhsNumber()); } 
    return result; }

  public String getname1() { return name1; }

  public static List getAllname1(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      if (result.contains(patientgpx.getname1())) { }
      else { result.add(patientgpx.getname1()); } }
    return result; }

  public static List getAllOrderedname1(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      result.add(patientgpx.getname1()); } 
    return result; }

  public String getname2() { return name2; }

  public static List getAllname2(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      if (result.contains(patientgpx.getname2())) { }
      else { result.add(patientgpx.getname2()); } }
    return result; }

  public static List getAllOrderedname2(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      result.add(patientgpx.getname2()); } 
    return result; }

  public int getdob() { return dob; }

  public static List getAlldob(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      if (result.contains(new Integer(patientgpx.getdob()))) { }
      else { result.add(new Integer(patientgpx.getdob())); } }
    return result; }

  public static List getAllOrdereddob(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      result.add(new Integer(patientgpx.getdob())); } 
    return result; }

  public String getaddr1() { return addr1; }

  public static List getAlladdr1(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      if (result.contains(patientgpx.getaddr1())) { }
      else { result.add(patientgpx.getaddr1()); } }
    return result; }

  public static List getAllOrderedaddr1(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      result.add(patientgpx.getaddr1()); } 
    return result; }

  public String getaddr2() { return addr2; }

  public static List getAlladdr2(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      if (result.contains(patientgpx.getaddr2())) { }
      else { result.add(patientgpx.getaddr2()); } }
    return result; }

  public static List getAllOrderedaddr2(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      result.add(patientgpx.getaddr2()); } 
    return result; }

  public String getpostcode() { return postcode; }

  public static List getAllpostcode(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      if (result.contains(patientgpx.getpostcode())) { }
      else { result.add(patientgpx.getpostcode()); } }
    return result; }

  public static List getAllOrderedpostcode(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      result.add(patientgpx.getpostcode()); } 
    return result; }

  public boolean getisMale() { return isMale; }

  public static List getAllisMale(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      if (result.contains(new Boolean(patientgpx.getisMale()))) { }
      else { result.add(new Boolean(patientgpx.getisMale())); } }
    return result; }

  public static List getAllOrderedisMale(List patientgps)
  { List result = new Vector();
    for (int i = 0; i < patientgps.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(i);
      result.add(new Boolean(patientgpx.getisMale())); } 
    return result; }

  public List getregisteredWith() { return (Vector) ((Vector) registeredWith).clone(); }

  public static List getAllregisteredWith(List patientgps)
  { List result = new Vector();
    for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      result = Set.union(result,patientgpx.getregisteredWith()); }
    return result; }

  public static List getAllOrderedregisteredWith(List patientgps)
  { List result = new Vector();
    for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      result = Set.union(result,patientgpx.getregisteredWith()); }
    return result; }

  public List getconsultations() { return (Vector) ((Vector) consultations).clone(); }

  public static List getAllconsultations(List patientgps)
  { List result = new Vector();
    for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      result = Set.union(result,patientgpx.getconsultations()); }
    return result; }

  public static List getAllOrderedconsultations(List patientgps)
  { List result = new Vector();
    for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      result = Set.union(result,patientgpx.getconsultations()); }
    return result; }

  public List getreferrals() { return (Vector) ((Vector) referrals).clone(); }

  public static List getAllreferrals(List patientgps)
  { List result = new Vector();
    for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      result = Set.union(result,patientgpx.getreferrals()); }
    return result; }

  public static List getAllOrderedreferrals(List patientgps)
  { List result = new Vector();
    for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx = (PatientGP) patientgps.get(_i);
      result = Set.union(result,patientgpx.getreferrals()); }
    return result; }

    public String toString()
  {   String result = "";
 
  result = name1 + " " + name2 + " " + nhsNumber;
    return result;
  }


    public void check1()
  {   if (this.getId().equals("")) 
  {   System.out.println("" + ( "Patient " + this + " has no Id value" ));
}
  }

    public void check2()
  {   if (this.getdob() == 0) 
  {   System.out.println("" + ( "Patient " + this + " has no DOB value" ));
}
  }

    public void check3()
  {   if (this.getname1().equals("")) 
  {   System.out.println("" + ( "Patient " + this + " has no firstname value" ));
}
  }

    public void check4()
  {   if (this.getname2().equals("")) 
  {   System.out.println("" + ( "Patient " + this + " has no surname value" ));
}
  }

    public void check5()
  {   if (this.getaddr1().equals("") || this.getaddr2().equals("") || this.getpostcode().equals("")) 
  {   System.out.println("" + ( "Patient " + this + " has missing address value" ));
}
  }

    public void check6(PatientGP p)
  {   if (!(p.getId().equals(this.getId())) && p.getname1().equals(this.getname1()) && p.getname2().equals(this.getname2()) && p.getdob() == this.getdob() && p.getisMale() == this.getisMale()) 
  {   System.out.println("" + ( "Duplicate patients?: " + this + " and " + p ));
}
  }

    public void check6outer()
  {  PatientGP patientgpx = this;
    List _range2 = Controller.inst().patientgps;
  for (int _i1 = 0; _i1 < _range2.size(); _i1++)
  { PatientGP p = (PatientGP) _range2.get(_i1);
       this.check6(p);
  }
  }


    public void task21()
  {   if (this.getnhsNumber().equals("patientGP0")) 
  {   System.out.println("" + Set.sortedBy(this.getconsultations(), Set.collect_1(this.getconsultations())));
}
  }

    public void task22()
  {   if (this.getnhsNumber().equals("patientGP8")) 
  {   System.out.println("" + Set.sortedBy(this.getreferrals(), Set.collect_2(this.getreferrals())));
}
  }

    public void migrategp1()
  {   if (Controller.inst().getPatientByPK(this.getId()) != null)
    { Patient q = Controller.inst().getPatientByPK(this.getId());
     Controller.inst().setnhsNo(q,this.getnhsNumber());
    Controller.inst().setfname(q,this.getname1());
    Controller.inst().setsname(q,this.getname2());
    Controller.inst().setdob(q,this.getdob());
    Controller.inst().setaddress1(q,this.getaddr1());
    Controller.inst().setaddress2(q,this.getaddr2());
  }
    else
    { Patient q = new Patient();
    Controller.inst().addPatient(q);
    Controller.inst().setId(q,this.getId());
    Controller.inst().setnhsNo(q,this.getnhsNumber());
    Controller.inst().setfname(q,this.getname1());
    Controller.inst().setsname(q,this.getname2());
    Controller.inst().setdob(q,this.getdob());
    Controller.inst().setaddress1(q,this.getaddr1());
    Controller.inst().setaddress2(q,this.getaddr2()); }

  }

    public void migrategp2()
  {   if (Referral.getAllreferredTo(this.getreferrals()).contains("optician")) 
  {   System.out.println("" + ( "Patient: " + this + " was referred to an optician" ));
}
  }

    public void task31()
  {   if (Set.exists_0(Controller.inst().patienths,this)) 
  {   System.out.println("" + this);
}
  }


}


class Doctor
  implements SystemTypes
{
  private String name1 = ""; // internal
  private String name2 = ""; // internal
  private String surgery = ""; // internal
  private String staffNumber = ""; // internal

  public Doctor()
  {
    this.name1 = "";
    this.name2 = "";
    this.surgery = "";
    this.staffNumber = "";

  }



  public String toString()
  { String _res_ = "(Doctor) ";
    _res_ = _res_ + name1 + ",";
    _res_ = _res_ + name2 + ",";
    _res_ = _res_ + surgery + ",";
    _res_ = _res_ + staffNumber;
    return _res_;
  }

  public void setname1(String name1_x) { name1 = name1_x;  }


  public static void setAllname1(List doctors,String val)
{ for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      Controller.inst().setname1(doctorx,val); } }


  public void setname2(String name2_x) { name2 = name2_x;  }


  public static void setAllname2(List doctors,String val)
{ for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      Controller.inst().setname2(doctorx,val); } }


  public void setsurgery(String surgery_x) { surgery = surgery_x;  }


  public static void setAllsurgery(List doctors,String val)
{ for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      Controller.inst().setsurgery(doctorx,val); } }


  public void setstaffNumber(String staffNumber_x) { staffNumber = staffNumber_x;  }


  public static void setAllstaffNumber(List doctors,String val)
{ for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      Controller.inst().setstaffNumber(doctorx,val); } }


  public String getname1() { return name1; }

  public static List getAllname1(List doctors)
  { List result = new Vector();
    for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      if (result.contains(doctorx.getname1())) { }
      else { result.add(doctorx.getname1()); } }
    return result; }

  public static List getAllOrderedname1(List doctors)
  { List result = new Vector();
    for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      result.add(doctorx.getname1()); } 
    return result; }

  public String getname2() { return name2; }

  public static List getAllname2(List doctors)
  { List result = new Vector();
    for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      if (result.contains(doctorx.getname2())) { }
      else { result.add(doctorx.getname2()); } }
    return result; }

  public static List getAllOrderedname2(List doctors)
  { List result = new Vector();
    for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      result.add(doctorx.getname2()); } 
    return result; }

  public String getsurgery() { return surgery; }

  public static List getAllsurgery(List doctors)
  { List result = new Vector();
    for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      if (result.contains(doctorx.getsurgery())) { }
      else { result.add(doctorx.getsurgery()); } }
    return result; }

  public static List getAllOrderedsurgery(List doctors)
  { List result = new Vector();
    for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      result.add(doctorx.getsurgery()); } 
    return result; }

  public String getstaffNumber() { return staffNumber; }

  public static List getAllstaffNumber(List doctors)
  { List result = new Vector();
    for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      if (result.contains(doctorx.getstaffNumber())) { }
      else { result.add(doctorx.getstaffNumber()); } }
    return result; }

  public static List getAllOrderedstaffNumber(List doctors)
  { List result = new Vector();
    for (int i = 0; i < doctors.size(); i++)
    { Doctor doctorx = (Doctor) doctors.get(i);
      result.add(doctorx.getstaffNumber()); } 
    return result; }


}


class Consultation
  implements SystemTypes
{
  private int date = 0; // internal
  private String outcome = ""; // internal
  private String symptoms = ""; // internal
  private Doctor doctor;

  public Consultation(Doctor doctor)
  {
    this.date = 0;
    this.outcome = "";
    this.symptoms = "";
    this.doctor = doctor;

  }

  public Consultation() { }



  public void setdate(int date_x) { date = date_x;  }


  public static void setAlldate(List consultations,int val)
{ for (int i = 0; i < consultations.size(); i++)
    { Consultation consultationx = (Consultation) consultations.get(i);
      Controller.inst().setdate(consultationx,val); } }


  public void setoutcome(String outcome_x) { outcome = outcome_x;  }


  public static void setAlloutcome(List consultations,String val)
{ for (int i = 0; i < consultations.size(); i++)
    { Consultation consultationx = (Consultation) consultations.get(i);
      Controller.inst().setoutcome(consultationx,val); } }


  public void setsymptoms(String symptoms_x) { symptoms = symptoms_x;  }


  public static void setAllsymptoms(List consultations,String val)
{ for (int i = 0; i < consultations.size(); i++)
    { Consultation consultationx = (Consultation) consultations.get(i);
      Controller.inst().setsymptoms(consultationx,val); } }


  public void setdoctor(Doctor doctorxx) { doctor = doctorxx;
  }

  public static void setAlldoctor(List consultations,Doctor _val)
  { for (int _i = 0; _i < consultations.size(); _i++)
    { Consultation consultationx = (Consultation) consultations.get(_i);
      Controller.inst().setdoctor(consultationx, _val); } }

  public int getdate() { return date; }

  public static List getAlldate(List consultations)
  { List result = new Vector();
    for (int i = 0; i < consultations.size(); i++)
    { Consultation consultationx = (Consultation) consultations.get(i);
      if (result.contains(new Integer(consultationx.getdate()))) { }
      else { result.add(new Integer(consultationx.getdate())); } }
    return result; }

  public static List getAllOrdereddate(List consultations)
  { List result = new Vector();
    for (int i = 0; i < consultations.size(); i++)
    { Consultation consultationx = (Consultation) consultations.get(i);
      result.add(new Integer(consultationx.getdate())); } 
    return result; }

  public String getoutcome() { return outcome; }

  public static List getAlloutcome(List consultations)
  { List result = new Vector();
    for (int i = 0; i < consultations.size(); i++)
    { Consultation consultationx = (Consultation) consultations.get(i);
      if (result.contains(consultationx.getoutcome())) { }
      else { result.add(consultationx.getoutcome()); } }
    return result; }

  public static List getAllOrderedoutcome(List consultations)
  { List result = new Vector();
    for (int i = 0; i < consultations.size(); i++)
    { Consultation consultationx = (Consultation) consultations.get(i);
      result.add(consultationx.getoutcome()); } 
    return result; }

  public String getsymptoms() { return symptoms; }

  public static List getAllsymptoms(List consultations)
  { List result = new Vector();
    for (int i = 0; i < consultations.size(); i++)
    { Consultation consultationx = (Consultation) consultations.get(i);
      if (result.contains(consultationx.getsymptoms())) { }
      else { result.add(consultationx.getsymptoms()); } }
    return result; }

  public static List getAllOrderedsymptoms(List consultations)
  { List result = new Vector();
    for (int i = 0; i < consultations.size(); i++)
    { Consultation consultationx = (Consultation) consultations.get(i);
      result.add(consultationx.getsymptoms()); } 
    return result; }

  public Doctor getdoctor() { return doctor; }

  public static List getAlldoctor(List consultations)
  { List result = new Vector();
    for (int _i = 0; _i < consultations.size(); _i++)
    { Consultation consultationx = (Consultation) consultations.get(_i);
      if (result.contains(consultationx.getdoctor())) {}
      else { result.add(consultationx.getdoctor()); }
 }
    return result; }

  public static List getAllOrdereddoctor(List consultations)
  { List result = new Vector();
    for (int _i = 0; _i < consultations.size(); _i++)
    { Consultation consultationx = (Consultation) consultations.get(_i);
      if (result.contains(consultationx.getdoctor())) {}
      else { result.add(consultationx.getdoctor()); }
 }
    return result; }

    public String toString()
  {   String result = "";
 
  result = "Consultation on: " + date + " Symptoms: " + symptoms + " Outcome: " + outcome;
    return result;
  }



}


class Referral
  implements SystemTypes
{
  private int date = 0; // internal
  private String referredTo = ""; // internal
  private Doctor referrer;

  public Referral(Doctor referrer)
  {
    this.date = 0;
    this.referredTo = "";
    this.referrer = referrer;

  }

  public Referral() { }



  public String toString()
  { String _res_ = "(Referral) ";
    _res_ = _res_ + date + ",";
    _res_ = _res_ + referredTo;
    return _res_;
  }

  public void setdate(int date_x) { date = date_x;  }


  public static void setAlldate(List referrals,int val)
{ for (int i = 0; i < referrals.size(); i++)
    { Referral referralx = (Referral) referrals.get(i);
      Controller.inst().setdate(referralx,val); } }


  public void setreferredTo(String referredTo_x) { referredTo = referredTo_x;  }


  public static void setAllreferredTo(List referrals,String val)
{ for (int i = 0; i < referrals.size(); i++)
    { Referral referralx = (Referral) referrals.get(i);
      Controller.inst().setreferredTo(referralx,val); } }


  public void setreferrer(Doctor referrerxx) { referrer = referrerxx;
  }

  public static void setAllreferrer(List referrals,Doctor _val)
  { for (int _i = 0; _i < referrals.size(); _i++)
    { Referral referralx = (Referral) referrals.get(_i);
      Controller.inst().setreferrer(referralx, _val); } }

  public int getdate() { return date; }

  public static List getAlldate(List referrals)
  { List result = new Vector();
    for (int i = 0; i < referrals.size(); i++)
    { Referral referralx = (Referral) referrals.get(i);
      if (result.contains(new Integer(referralx.getdate()))) { }
      else { result.add(new Integer(referralx.getdate())); } }
    return result; }

  public static List getAllOrdereddate(List referrals)
  { List result = new Vector();
    for (int i = 0; i < referrals.size(); i++)
    { Referral referralx = (Referral) referrals.get(i);
      result.add(new Integer(referralx.getdate())); } 
    return result; }

  public String getreferredTo() { return referredTo; }

  public static List getAllreferredTo(List referrals)
  { List result = new Vector();
    for (int i = 0; i < referrals.size(); i++)
    { Referral referralx = (Referral) referrals.get(i);
      if (result.contains(referralx.getreferredTo())) { }
      else { result.add(referralx.getreferredTo()); } }
    return result; }

  public static List getAllOrderedreferredTo(List referrals)
  { List result = new Vector();
    for (int i = 0; i < referrals.size(); i++)
    { Referral referralx = (Referral) referrals.get(i);
      result.add(referralx.getreferredTo()); } 
    return result; }

  public Doctor getreferrer() { return referrer; }

  public static List getAllreferrer(List referrals)
  { List result = new Vector();
    for (int _i = 0; _i < referrals.size(); _i++)
    { Referral referralx = (Referral) referrals.get(_i);
      if (result.contains(referralx.getreferrer())) {}
      else { result.add(referralx.getreferrer()); }
 }
    return result; }

  public static List getAllOrderedreferrer(List referrals)
  { List result = new Vector();
    for (int _i = 0; _i < referrals.size(); _i++)
    { Referral referralx = (Referral) referrals.get(_i);
      if (result.contains(referralx.getreferrer())) {}
      else { result.add(referralx.getreferrer()); }
 }
    return result; }


}


class PatientH
  implements SystemTypes
{
  private String hospitalNumber = ""; // internal
  private String forename = ""; // internal
  private String surname = ""; // internal
  private int ageyrs = 0; // internal
  private int agemnths = 0; // internal
  private String ward = ""; // internal
  private int bed = 0; // internal
  private boolean inpatient = false; // internal
  private List treatments = new Vector(); // of Treatment
  private List investigations = new Vector(); // of Investigation

  public PatientH()
  {
    this.hospitalNumber = "";
    this.forename = "";
    this.surname = "";
    this.ageyrs = 0;
    this.agemnths = 0;
    this.ward = "";
    this.bed = 0;
    this.inpatient = false;

  }



  public String toString()
  { String _res_ = "(PatientH) ";
    _res_ = _res_ + hospitalNumber + ",";
    _res_ = _res_ + forename + ",";
    _res_ = _res_ + surname + ",";
    _res_ = _res_ + ageyrs + ",";
    _res_ = _res_ + agemnths + ",";
    _res_ = _res_ + ward + ",";
    _res_ = _res_ + bed + ",";
    _res_ = _res_ + inpatient;
    return _res_;
  }

  public void sethospitalNumber(String hospitalNumber_x) { hospitalNumber = hospitalNumber_x;  }


  public static void setAllhospitalNumber(List patienths,String val)
{ for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      Controller.inst().sethospitalNumber(patienthx,val); } }


  public void setforename(String forename_x) { forename = forename_x;  }


  public static void setAllforename(List patienths,String val)
{ for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      Controller.inst().setforename(patienthx,val); } }


  public void setsurname(String surname_x) { surname = surname_x;  }


  public static void setAllsurname(List patienths,String val)
{ for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      Controller.inst().setsurname(patienthx,val); } }


  public void setageyrs(int ageyrs_x) { ageyrs = ageyrs_x;  }


  public static void setAllageyrs(List patienths,int val)
{ for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      Controller.inst().setageyrs(patienthx,val); } }


  public void setagemnths(int agemnths_x) { agemnths = agemnths_x;  }


  public static void setAllagemnths(List patienths,int val)
{ for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      Controller.inst().setagemnths(patienthx,val); } }


  public void setward(String ward_x) { ward = ward_x;  }


  public static void setAllward(List patienths,String val)
{ for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      Controller.inst().setward(patienthx,val); } }


  public void setbed(int bed_x) { bed = bed_x;  }


  public static void setAllbed(List patienths,int val)
{ for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      Controller.inst().setbed(patienthx,val); } }


  public void setinpatient(boolean inpatient_x) { inpatient = inpatient_x;  }


  public static void setAllinpatient(List patienths,boolean val)
{ for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      Controller.inst().setinpatient(patienthx,val); } }


  public void settreatments(List treatmentsxx) { treatments = treatmentsxx;
    }
 
  public void settreatments(int ind_x,Treatment treatmentsxx) { treatments.set(ind_x,treatmentsxx); }

 public void addtreatments(Treatment treatmentsxx) { treatments.add(treatmentsxx);
    }
 
  public void removetreatments(Treatment treatmentsxx) { Vector _removedtreatmentstreatmentsxx = new Vector();
  _removedtreatmentstreatmentsxx.add(treatmentsxx);
  treatments.removeAll(_removedtreatmentstreatmentsxx);
    }

  public static void setAlltreatments(List patienths,List _val)
  { for (int _i = 0; _i < patienths.size(); _i++)
    { PatientH patienthx = (PatientH) patienths.get(_i);
      Controller.inst().settreatments(patienthx, _val); } }

  public static void setAlltreatments(List patienths,int _ind,Treatment _val)
  { for (int _i = 0; _i < patienths.size(); _i++)
    { PatientH patienthx = (PatientH) patienths.get(_i);
      Controller.inst().settreatments(patienthx,_ind,_val); } }

  public static void addAlltreatments(List patienths,Treatment _val)
  { for (int _i = 0; _i < patienths.size(); _i++)
    { PatientH patienthx = (PatientH) patienths.get(_i);
      Controller.inst().addtreatments(patienthx, _val); } }


  public static void removeAlltreatments(List patienths,Treatment _val)
  { for (int _i = 0; _i < patienths.size(); _i++)
    { PatientH patienthx = (PatientH) patienths.get(_i);
      Controller.inst().removetreatments(patienthx, _val); } }


  public static void unionAlltreatments(List patienths, List _val)
  { for (int _i = 0; _i < patienths.size(); _i++)
    { PatientH patienthx = (PatientH) patienths.get(_i);
      Controller.inst().uniontreatments(patienthx, _val); } }


  public static void subtractAlltreatments(List patienths, List _val)
  { for (int _i = 0; _i < patienths.size(); _i++)
    { PatientH patienthx = (PatientH) patienths.get(_i);
      Controller.inst().subtracttreatments(patienthx, _val); } }


  public void setinvestigations(List investigationsxx) { investigations = investigationsxx;
    }
 
  public void addinvestigations(Investigation investigationsxx) { investigations.add(investigationsxx);
    }
 
  public void removeinvestigations(Investigation investigationsxx) { Vector _removedinvestigationsinvestigationsxx = new Vector();
  _removedinvestigationsinvestigationsxx.add(investigationsxx);
  investigations.removeAll(_removedinvestigationsinvestigationsxx);
    }

  public static void setAllinvestigations(List patienths,List _val)
  { for (int _i = 0; _i < patienths.size(); _i++)
    { PatientH patienthx = (PatientH) patienths.get(_i);
      Controller.inst().setinvestigations(patienthx, _val); } }

  public static void addAllinvestigations(List patienths,Investigation _val)
  { for (int _i = 0; _i < patienths.size(); _i++)
    { PatientH patienthx = (PatientH) patienths.get(_i);
      Controller.inst().addinvestigations(patienthx, _val); } }


  public static void removeAllinvestigations(List patienths,Investigation _val)
  { for (int _i = 0; _i < patienths.size(); _i++)
    { PatientH patienthx = (PatientH) patienths.get(_i);
      Controller.inst().removeinvestigations(patienthx, _val); } }


  public static void unionAllinvestigations(List patienths, List _val)
  { for (int _i = 0; _i < patienths.size(); _i++)
    { PatientH patienthx = (PatientH) patienths.get(_i);
      Controller.inst().unioninvestigations(patienthx, _val); } }


  public static void subtractAllinvestigations(List patienths, List _val)
  { for (int _i = 0; _i < patienths.size(); _i++)
    { PatientH patienthx = (PatientH) patienths.get(_i);
      Controller.inst().subtractinvestigations(patienthx, _val); } }


  public String gethospitalNumber() { return hospitalNumber; }

  public static List getAllhospitalNumber(List patienths)
  { List result = new Vector();
    for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      if (result.contains(patienthx.gethospitalNumber())) { }
      else { result.add(patienthx.gethospitalNumber()); } }
    return result; }

  public static List getAllOrderedhospitalNumber(List patienths)
  { List result = new Vector();
    for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      result.add(patienthx.gethospitalNumber()); } 
    return result; }

  public String getforename() { return forename; }

  public static List getAllforename(List patienths)
  { List result = new Vector();
    for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      if (result.contains(patienthx.getforename())) { }
      else { result.add(patienthx.getforename()); } }
    return result; }

  public static List getAllOrderedforename(List patienths)
  { List result = new Vector();
    for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      result.add(patienthx.getforename()); } 
    return result; }

  public String getsurname() { return surname; }

  public static List getAllsurname(List patienths)
  { List result = new Vector();
    for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      if (result.contains(patienthx.getsurname())) { }
      else { result.add(patienthx.getsurname()); } }
    return result; }

  public static List getAllOrderedsurname(List patienths)
  { List result = new Vector();
    for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      result.add(patienthx.getsurname()); } 
    return result; }

  public int getageyrs() { return ageyrs; }

  public static List getAllageyrs(List patienths)
  { List result = new Vector();
    for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      if (result.contains(new Integer(patienthx.getageyrs()))) { }
      else { result.add(new Integer(patienthx.getageyrs())); } }
    return result; }

  public static List getAllOrderedageyrs(List patienths)
  { List result = new Vector();
    for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      result.add(new Integer(patienthx.getageyrs())); } 
    return result; }

  public int getagemnths() { return agemnths; }

  public static List getAllagemnths(List patienths)
  { List result = new Vector();
    for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      if (result.contains(new Integer(patienthx.getagemnths()))) { }
      else { result.add(new Integer(patienthx.getagemnths())); } }
    return result; }

  public static List getAllOrderedagemnths(List patienths)
  { List result = new Vector();
    for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      result.add(new Integer(patienthx.getagemnths())); } 
    return result; }

  public String getward() { return ward; }

  public static List getAllward(List patienths)
  { List result = new Vector();
    for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      if (result.contains(patienthx.getward())) { }
      else { result.add(patienthx.getward()); } }
    return result; }

  public static List getAllOrderedward(List patienths)
  { List result = new Vector();
    for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      result.add(patienthx.getward()); } 
    return result; }

  public int getbed() { return bed; }

  public static List getAllbed(List patienths)
  { List result = new Vector();
    for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      if (result.contains(new Integer(patienthx.getbed()))) { }
      else { result.add(new Integer(patienthx.getbed())); } }
    return result; }

  public static List getAllOrderedbed(List patienths)
  { List result = new Vector();
    for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      result.add(new Integer(patienthx.getbed())); } 
    return result; }

  public boolean getinpatient() { return inpatient; }

  public static List getAllinpatient(List patienths)
  { List result = new Vector();
    for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      if (result.contains(new Boolean(patienthx.getinpatient()))) { }
      else { result.add(new Boolean(patienthx.getinpatient())); } }
    return result; }

  public static List getAllOrderedinpatient(List patienths)
  { List result = new Vector();
    for (int i = 0; i < patienths.size(); i++)
    { PatientH patienthx = (PatientH) patienths.get(i);
      result.add(new Boolean(patienthx.getinpatient())); } 
    return result; }

  public List gettreatments() { return (Vector) ((Vector) treatments).clone(); }

  public static List getAlltreatments(List patienths)
  { List result = new Vector();
    for (int _i = 0; _i < patienths.size(); _i++)
    { PatientH patienthx = (PatientH) patienths.get(_i);
      result = Set.union(result,patienthx.gettreatments()); }
    return result; }

  public static List getAllOrderedtreatments(List patienths)
  { List result = new Vector();
    for (int _i = 0; _i < patienths.size(); _i++)
    { PatientH patienthx = (PatientH) patienths.get(_i);
      result.addAll(patienthx.gettreatments()); }
    return result; }

  public List getinvestigations() { return (Vector) ((Vector) investigations).clone(); }

  public static List getAllinvestigations(List patienths)
  { List result = new Vector();
    for (int _i = 0; _i < patienths.size(); _i++)
    { PatientH patienthx = (PatientH) patienths.get(_i);
      result = Set.union(result,patienthx.getinvestigations()); }
    return result; }

  public static List getAllOrderedinvestigations(List patienths)
  { List result = new Vector();
    for (int _i = 0; _i < patienths.size(); _i++)
    { PatientH patienthx = (PatientH) patienths.get(_i);
      result = Set.union(result,patienthx.getinvestigations()); }
    return result; }


}


class Treatment
  implements SystemTypes
{
  private int date = 0; // internal
  private String description = ""; // internal
  private List clinicians = new Vector(); // of Clinician

  public Treatment()
  {
    this.date = 0;
    this.description = "";

  }



  public String toString()
  { String _res_ = "(Treatment) ";
    _res_ = _res_ + date + ",";
    _res_ = _res_ + description;
    return _res_;
  }

  public void setdate(int date_x) { date = date_x;  }


  public static void setAlldate(List treatments,int val)
{ for (int i = 0; i < treatments.size(); i++)
    { Treatment treatmentx = (Treatment) treatments.get(i);
      Controller.inst().setdate(treatmentx,val); } }


  public void setdescription(String description_x) { description = description_x;  }


  public static void setAlldescription(List treatments,String val)
{ for (int i = 0; i < treatments.size(); i++)
    { Treatment treatmentx = (Treatment) treatments.get(i);
      Controller.inst().setdescription(treatmentx,val); } }


  public void setclinicians(List cliniciansxx) { clinicians = cliniciansxx;
    }
 
  public void addclinicians(Clinician cliniciansxx) { clinicians.add(cliniciansxx);
    }
 
  public void removeclinicians(Clinician cliniciansxx) { Vector _removedclinicianscliniciansxx = new Vector();
  _removedclinicianscliniciansxx.add(cliniciansxx);
  clinicians.removeAll(_removedclinicianscliniciansxx);
    }

  public static void setAllclinicians(List treatments,List _val)
  { for (int _i = 0; _i < treatments.size(); _i++)
    { Treatment treatmentx = (Treatment) treatments.get(_i);
      Controller.inst().setclinicians(treatmentx, _val); } }

  public static void addAllclinicians(List treatments,Clinician _val)
  { for (int _i = 0; _i < treatments.size(); _i++)
    { Treatment treatmentx = (Treatment) treatments.get(_i);
      Controller.inst().addclinicians(treatmentx, _val); } }


  public static void removeAllclinicians(List treatments,Clinician _val)
  { for (int _i = 0; _i < treatments.size(); _i++)
    { Treatment treatmentx = (Treatment) treatments.get(_i);
      Controller.inst().removeclinicians(treatmentx, _val); } }


  public static void unionAllclinicians(List treatments, List _val)
  { for (int _i = 0; _i < treatments.size(); _i++)
    { Treatment treatmentx = (Treatment) treatments.get(_i);
      Controller.inst().unionclinicians(treatmentx, _val); } }


  public static void subtractAllclinicians(List treatments, List _val)
  { for (int _i = 0; _i < treatments.size(); _i++)
    { Treatment treatmentx = (Treatment) treatments.get(_i);
      Controller.inst().subtractclinicians(treatmentx, _val); } }


  public int getdate() { return date; }

  public static List getAlldate(List treatments)
  { List result = new Vector();
    for (int i = 0; i < treatments.size(); i++)
    { Treatment treatmentx = (Treatment) treatments.get(i);
      if (result.contains(new Integer(treatmentx.getdate()))) { }
      else { result.add(new Integer(treatmentx.getdate())); } }
    return result; }

  public static List getAllOrdereddate(List treatments)
  { List result = new Vector();
    for (int i = 0; i < treatments.size(); i++)
    { Treatment treatmentx = (Treatment) treatments.get(i);
      result.add(new Integer(treatmentx.getdate())); } 
    return result; }

  public String getdescription() { return description; }

  public static List getAlldescription(List treatments)
  { List result = new Vector();
    for (int i = 0; i < treatments.size(); i++)
    { Treatment treatmentx = (Treatment) treatments.get(i);
      if (result.contains(treatmentx.getdescription())) { }
      else { result.add(treatmentx.getdescription()); } }
    return result; }

  public static List getAllOrdereddescription(List treatments)
  { List result = new Vector();
    for (int i = 0; i < treatments.size(); i++)
    { Treatment treatmentx = (Treatment) treatments.get(i);
      result.add(treatmentx.getdescription()); } 
    return result; }

  public List getclinicians() { return (Vector) ((Vector) clinicians).clone(); }

  public static List getAllclinicians(List treatments)
  { List result = new Vector();
    for (int _i = 0; _i < treatments.size(); _i++)
    { Treatment treatmentx = (Treatment) treatments.get(_i);
      result = Set.union(result,treatmentx.getclinicians()); }
    return result; }

  public static List getAllOrderedclinicians(List treatments)
  { List result = new Vector();
    for (int _i = 0; _i < treatments.size(); _i++)
    { Treatment treatmentx = (Treatment) treatments.get(_i);
      result = Set.union(result,treatmentx.getclinicians()); }
    return result; }


}


class Investigation
  implements SystemTypes
{
  private String description = ""; // internal
  private String result = ""; // internal
  private List clinicians = new Vector(); // of Clinician

  public Investigation()
  {
    this.description = "";
    this.result = "";

  }



  public String toString()
  { String _res_ = "(Investigation) ";
    _res_ = _res_ + description + ",";
    _res_ = _res_ + result;
    return _res_;
  }

  public void setdescription(String description_x) { description = description_x;  }


  public static void setAlldescription(List investigations,String val)
{ for (int i = 0; i < investigations.size(); i++)
    { Investigation investigationx = (Investigation) investigations.get(i);
      Controller.inst().setdescription(investigationx,val); } }


  public void setresult(String result_x) { result = result_x;  }


  public static void setAllresult(List investigations,String val)
{ for (int i = 0; i < investigations.size(); i++)
    { Investigation investigationx = (Investigation) investigations.get(i);
      Controller.inst().setresult(investigationx,val); } }


  public void setclinicians(List cliniciansxx) { clinicians = cliniciansxx;
    }
 
  public void addclinicians(Clinician cliniciansxx) { clinicians.add(cliniciansxx);
    }
 
  public void removeclinicians(Clinician cliniciansxx) { Vector _removedclinicianscliniciansxx = new Vector();
  _removedclinicianscliniciansxx.add(cliniciansxx);
  clinicians.removeAll(_removedclinicianscliniciansxx);
    }

  public static void setAllclinicians(List investigations,List _val)
  { for (int _i = 0; _i < investigations.size(); _i++)
    { Investigation investigationx = (Investigation) investigations.get(_i);
      Controller.inst().setclinicians(investigationx, _val); } }

  public static void addAllclinicians(List investigations,Clinician _val)
  { for (int _i = 0; _i < investigations.size(); _i++)
    { Investigation investigationx = (Investigation) investigations.get(_i);
      Controller.inst().addclinicians(investigationx, _val); } }


  public static void removeAllclinicians(List investigations,Clinician _val)
  { for (int _i = 0; _i < investigations.size(); _i++)
    { Investigation investigationx = (Investigation) investigations.get(_i);
      Controller.inst().removeclinicians(investigationx, _val); } }


  public static void unionAllclinicians(List investigations, List _val)
  { for (int _i = 0; _i < investigations.size(); _i++)
    { Investigation investigationx = (Investigation) investigations.get(_i);
      Controller.inst().unionclinicians(investigationx, _val); } }


  public static void subtractAllclinicians(List investigations, List _val)
  { for (int _i = 0; _i < investigations.size(); _i++)
    { Investigation investigationx = (Investigation) investigations.get(_i);
      Controller.inst().subtractclinicians(investigationx, _val); } }


  public String getdescription() { return description; }

  public static List getAlldescription(List investigations)
  { List result = new Vector();
    for (int i = 0; i < investigations.size(); i++)
    { Investigation investigationx = (Investigation) investigations.get(i);
      if (result.contains(investigationx.getdescription())) { }
      else { result.add(investigationx.getdescription()); } }
    return result; }

  public static List getAllOrdereddescription(List investigations)
  { List result = new Vector();
    for (int i = 0; i < investigations.size(); i++)
    { Investigation investigationx = (Investigation) investigations.get(i);
      result.add(investigationx.getdescription()); } 
    return result; }

  public String getresult() { return result; }

  public static List getAllresult(List investigations)
  { List result = new Vector();
    for (int i = 0; i < investigations.size(); i++)
    { Investigation investigationx = (Investigation) investigations.get(i);
      if (result.contains(investigationx.getresult())) { }
      else { result.add(investigationx.getresult()); } }
    return result; }

  public static List getAllOrderedresult(List investigations)
  { List result = new Vector();
    for (int i = 0; i < investigations.size(); i++)
    { Investigation investigationx = (Investigation) investigations.get(i);
      result.add(investigationx.getresult()); } 
    return result; }

  public List getclinicians() { return (Vector) ((Vector) clinicians).clone(); }

  public static List getAllclinicians(List investigations)
  { List result = new Vector();
    for (int _i = 0; _i < investigations.size(); _i++)
    { Investigation investigationx = (Investigation) investigations.get(_i);
      result = Set.union(result,investigationx.getclinicians()); }
    return result; }

  public static List getAllOrderedclinicians(List investigations)
  { List result = new Vector();
    for (int _i = 0; _i < investigations.size(); _i++)
    { Investigation investigationx = (Investigation) investigations.get(_i);
      result = Set.union(result,investigationx.getclinicians()); }
    return result; }


}


class Clinician
  implements SystemTypes
{
  private String name = ""; // internal
  private String jobTitle = ""; // internal
  private String jobCode = ""; // internal

  public Clinician()
  {
    this.name = "";
    this.jobTitle = "";
    this.jobCode = "";

  }



  public String toString()
  { String _res_ = "(Clinician) ";
    _res_ = _res_ + name + ",";
    _res_ = _res_ + jobTitle + ",";
    _res_ = _res_ + jobCode;
    return _res_;
  }

  public void setname(String name_x) { name = name_x;  }


  public static void setAllname(List clinicians,String val)
{ for (int i = 0; i < clinicians.size(); i++)
    { Clinician clinicianx = (Clinician) clinicians.get(i);
      Controller.inst().setname(clinicianx,val); } }


  public void setjobTitle(String jobTitle_x) { jobTitle = jobTitle_x;  }


  public static void setAlljobTitle(List clinicians,String val)
{ for (int i = 0; i < clinicians.size(); i++)
    { Clinician clinicianx = (Clinician) clinicians.get(i);
      Controller.inst().setjobTitle(clinicianx,val); } }


  public void setjobCode(String jobCode_x) { jobCode = jobCode_x;  }


  public static void setAlljobCode(List clinicians,String val)
{ for (int i = 0; i < clinicians.size(); i++)
    { Clinician clinicianx = (Clinician) clinicians.get(i);
      Controller.inst().setjobCode(clinicianx,val); } }


  public String getname() { return name; }

  public static List getAllname(List clinicians)
  { List result = new Vector();
    for (int i = 0; i < clinicians.size(); i++)
    { Clinician clinicianx = (Clinician) clinicians.get(i);
      if (result.contains(clinicianx.getname())) { }
      else { result.add(clinicianx.getname()); } }
    return result; }

  public static List getAllOrderedname(List clinicians)
  { List result = new Vector();
    for (int i = 0; i < clinicians.size(); i++)
    { Clinician clinicianx = (Clinician) clinicians.get(i);
      result.add(clinicianx.getname()); } 
    return result; }

  public String getjobTitle() { return jobTitle; }

  public static List getAlljobTitle(List clinicians)
  { List result = new Vector();
    for (int i = 0; i < clinicians.size(); i++)
    { Clinician clinicianx = (Clinician) clinicians.get(i);
      if (result.contains(clinicianx.getjobTitle())) { }
      else { result.add(clinicianx.getjobTitle()); } }
    return result; }

  public static List getAllOrderedjobTitle(List clinicians)
  { List result = new Vector();
    for (int i = 0; i < clinicians.size(); i++)
    { Clinician clinicianx = (Clinician) clinicians.get(i);
      result.add(clinicianx.getjobTitle()); } 
    return result; }

  public String getjobCode() { return jobCode; }

  public static List getAlljobCode(List clinicians)
  { List result = new Vector();
    for (int i = 0; i < clinicians.size(); i++)
    { Clinician clinicianx = (Clinician) clinicians.get(i);
      if (result.contains(clinicianx.getjobCode())) { }
      else { result.add(clinicianx.getjobCode()); } }
    return result; }

  public static List getAllOrderedjobCode(List clinicians)
  { List result = new Vector();
    for (int i = 0; i < clinicians.size(); i++)
    { Clinician clinicianx = (Clinician) clinicians.get(i);
      result.add(clinicianx.getjobCode()); } 
    return result; }


}


class Patient
  implements SystemTypes
{
  private String nhsNo = ""; // internal
  private String fname = ""; // internal
  private String sname = ""; // internal
  private int dob = 0; // internal
  private String address1 = ""; // internal
  private String address2 = ""; // internal
  private String Id = ""; // internal
  private List interventions = new Vector(); // of Intervention

  public Patient()
  {
    this.nhsNo = "";
    this.fname = "";
    this.sname = "";
    this.dob = 0;
    this.address1 = "";
    this.address2 = "";
    this.Id = "";

  }



  public String toString()
  { String _res_ = "(Patient) ";
    _res_ = _res_ + nhsNo + ",";
    _res_ = _res_ + fname + ",";
    _res_ = _res_ + sname + ",";
    _res_ = _res_ + dob + ",";
    _res_ = _res_ + address1 + ",";
    _res_ = _res_ + address2 + ",";
    _res_ = _res_ + Id;
    return _res_;
  }

  public void setnhsNo(String nhsNo_x) { nhsNo = nhsNo_x;  }


  public static void setAllnhsNo(List patients,String val)
{ for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      Controller.inst().setnhsNo(patientx,val); } }


  public void setfname(String fname_x) { fname = fname_x;  }


  public static void setAllfname(List patients,String val)
{ for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      Controller.inst().setfname(patientx,val); } }


  public void setsname(String sname_x) { sname = sname_x;  }


  public static void setAllsname(List patients,String val)
{ for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      Controller.inst().setsname(patientx,val); } }


  public void setdob(int dob_x) { dob = dob_x;  }


  public static void setAlldob(List patients,int val)
{ for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      Controller.inst().setdob(patientx,val); } }


  public void setaddress1(String address1_x) { address1 = address1_x;  }


  public static void setAlladdress1(List patients,String val)
{ for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      Controller.inst().setaddress1(patientx,val); } }


  public void setaddress2(String address2_x) { address2 = address2_x;  }


  public static void setAlladdress2(List patients,String val)
{ for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      Controller.inst().setaddress2(patientx,val); } }


  public void setId(String Id_x) { Id = Id_x;  }


  public static void setAllId(List patients,String val)
{ for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      Controller.inst().setId(patientx,val); } }


  public void setinterventions(List interventionsxx) { interventions = interventionsxx;
    }
 
  public void addinterventions(Intervention interventionsxx) { interventions.add(interventionsxx);
    }
 
  public void removeinterventions(Intervention interventionsxx) { Vector _removedinterventionsinterventionsxx = new Vector();
  _removedinterventionsinterventionsxx.add(interventionsxx);
  interventions.removeAll(_removedinterventionsinterventionsxx);
    }

  public static void setAllinterventions(List patients,List _val)
  { for (int _i = 0; _i < patients.size(); _i++)
    { Patient patientx = (Patient) patients.get(_i);
      Controller.inst().setinterventions(patientx, _val); } }

  public static void addAllinterventions(List patients,Intervention _val)
  { for (int _i = 0; _i < patients.size(); _i++)
    { Patient patientx = (Patient) patients.get(_i);
      Controller.inst().addinterventions(patientx, _val); } }


  public static void removeAllinterventions(List patients,Intervention _val)
  { for (int _i = 0; _i < patients.size(); _i++)
    { Patient patientx = (Patient) patients.get(_i);
      Controller.inst().removeinterventions(patientx, _val); } }


  public static void unionAllinterventions(List patients, List _val)
  { for (int _i = 0; _i < patients.size(); _i++)
    { Patient patientx = (Patient) patients.get(_i);
      Controller.inst().unioninterventions(patientx, _val); } }


  public static void subtractAllinterventions(List patients, List _val)
  { for (int _i = 0; _i < patients.size(); _i++)
    { Patient patientx = (Patient) patients.get(_i);
      Controller.inst().subtractinterventions(patientx, _val); } }


  public String getnhsNo() { return nhsNo; }

  public static List getAllnhsNo(List patients)
  { List result = new Vector();
    for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      if (result.contains(patientx.getnhsNo())) { }
      else { result.add(patientx.getnhsNo()); } }
    return result; }

  public static List getAllOrderednhsNo(List patients)
  { List result = new Vector();
    for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      result.add(patientx.getnhsNo()); } 
    return result; }

  public String getfname() { return fname; }

  public static List getAllfname(List patients)
  { List result = new Vector();
    for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      if (result.contains(patientx.getfname())) { }
      else { result.add(patientx.getfname()); } }
    return result; }

  public static List getAllOrderedfname(List patients)
  { List result = new Vector();
    for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      result.add(patientx.getfname()); } 
    return result; }

  public String getsname() { return sname; }

  public static List getAllsname(List patients)
  { List result = new Vector();
    for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      if (result.contains(patientx.getsname())) { }
      else { result.add(patientx.getsname()); } }
    return result; }

  public static List getAllOrderedsname(List patients)
  { List result = new Vector();
    for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      result.add(patientx.getsname()); } 
    return result; }

  public int getdob() { return dob; }

  public static List getAlldob(List patients)
  { List result = new Vector();
    for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      if (result.contains(new Integer(patientx.getdob()))) { }
      else { result.add(new Integer(patientx.getdob())); } }
    return result; }

  public static List getAllOrdereddob(List patients)
  { List result = new Vector();
    for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      result.add(new Integer(patientx.getdob())); } 
    return result; }

  public String getaddress1() { return address1; }

  public static List getAlladdress1(List patients)
  { List result = new Vector();
    for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      if (result.contains(patientx.getaddress1())) { }
      else { result.add(patientx.getaddress1()); } }
    return result; }

  public static List getAllOrderedaddress1(List patients)
  { List result = new Vector();
    for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      result.add(patientx.getaddress1()); } 
    return result; }

  public String getaddress2() { return address2; }

  public static List getAlladdress2(List patients)
  { List result = new Vector();
    for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      if (result.contains(patientx.getaddress2())) { }
      else { result.add(patientx.getaddress2()); } }
    return result; }

  public static List getAllOrderedaddress2(List patients)
  { List result = new Vector();
    for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      result.add(patientx.getaddress2()); } 
    return result; }

  public String getId() { return Id; }

  public static List getAllId(List patients)
  { List result = new Vector();
    for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      if (result.contains(patientx.getId())) { }
      else { result.add(patientx.getId()); } }
    return result; }

  public static List getAllOrderedId(List patients)
  { List result = new Vector();
    for (int i = 0; i < patients.size(); i++)
    { Patient patientx = (Patient) patients.get(i);
      result.add(patientx.getId()); } 
    return result; }

  public List getinterventions() { return (Vector) ((Vector) interventions).clone(); }

  public static List getAllinterventions(List patients)
  { List result = new Vector();
    for (int _i = 0; _i < patients.size(); _i++)
    { Patient patientx = (Patient) patients.get(_i);
      result = Set.union(result,patientx.getinterventions()); }
    return result; }

  public static List getAllOrderedinterventions(List patients)
  { List result = new Vector();
    for (int _i = 0; _i < patients.size(); _i++)
    { Patient patientx = (Patient) patients.get(_i);
      result = Set.union(result,patientx.getinterventions()); }
    return result; }


}


class Staff
  implements SystemTypes
{
  private String fname = ""; // internal
  private String sname = ""; // internal
  private String staffcode = ""; // internal
  private List interventions = new Vector(); // of Intervention

  public Staff()
  {
    this.fname = "";
    this.sname = "";
    this.staffcode = "";

  }



  public String toString()
  { String _res_ = "(Staff) ";
    _res_ = _res_ + fname + ",";
    _res_ = _res_ + sname + ",";
    _res_ = _res_ + staffcode;
    return _res_;
  }

  public void setfname(String fname_x) { fname = fname_x;  }


  public static void setAllfname(List staffs,String val)
{ for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      Controller.inst().setfname(staffx,val); } }


  public void setsname(String sname_x) { sname = sname_x;  }


  public static void setAllsname(List staffs,String val)
{ for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      Controller.inst().setsname(staffx,val); } }


  public void setstaffcode(String staffcode_x) { staffcode = staffcode_x;  }


  public static void setAllstaffcode(List staffs,String val)
{ for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      Controller.inst().setstaffcode(staffx,val); } }


  public void setinterventions(List interventionsxx) { interventions = interventionsxx;
    }
 
  public void addinterventions(Intervention interventionsxx) { interventions.add(interventionsxx);
    }
 
  public void removeinterventions(Intervention interventionsxx) { Vector _removedinterventionsinterventionsxx = new Vector();
  _removedinterventionsinterventionsxx.add(interventionsxx);
  interventions.removeAll(_removedinterventionsinterventionsxx);
    }

  public static void setAllinterventions(List staffs,List _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().setinterventions(staffx, _val); } }

  public static void addAllinterventions(List staffs,Intervention _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().addinterventions(staffx, _val); } }


  public static void removeAllinterventions(List staffs,Intervention _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().removeinterventions(staffx, _val); } }


  public static void unionAllinterventions(List staffs, List _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().unioninterventions(staffx, _val); } }


  public static void subtractAllinterventions(List staffs, List _val)
  { for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      Controller.inst().subtractinterventions(staffx, _val); } }


  public String getfname() { return fname; }

  public static List getAllfname(List staffs)
  { List result = new Vector();
    for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      if (result.contains(staffx.getfname())) { }
      else { result.add(staffx.getfname()); } }
    return result; }

  public static List getAllOrderedfname(List staffs)
  { List result = new Vector();
    for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      result.add(staffx.getfname()); } 
    return result; }

  public String getsname() { return sname; }

  public static List getAllsname(List staffs)
  { List result = new Vector();
    for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      if (result.contains(staffx.getsname())) { }
      else { result.add(staffx.getsname()); } }
    return result; }

  public static List getAllOrderedsname(List staffs)
  { List result = new Vector();
    for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      result.add(staffx.getsname()); } 
    return result; }

  public String getstaffcode() { return staffcode; }

  public static List getAllstaffcode(List staffs)
  { List result = new Vector();
    for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      if (result.contains(staffx.getstaffcode())) { }
      else { result.add(staffx.getstaffcode()); } }
    return result; }

  public static List getAllOrderedstaffcode(List staffs)
  { List result = new Vector();
    for (int i = 0; i < staffs.size(); i++)
    { Staff staffx = (Staff) staffs.get(i);
      result.add(staffx.getstaffcode()); } 
    return result; }

  public List getinterventions() { return (Vector) ((Vector) interventions).clone(); }

  public static List getAllinterventions(List staffs)
  { List result = new Vector();
    for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      result = Set.union(result,staffx.getinterventions()); }
    return result; }

  public static List getAllOrderedinterventions(List staffs)
  { List result = new Vector();
    for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx = (Staff) staffs.get(_i);
      result = Set.union(result,staffx.getinterventions()); }
    return result; }


}


class Intervention
  implements SystemTypes
{
  private String description = ""; // internal
  private int date = 0; // internal
  private String category = ""; // internal
  private List location = new Vector(); // of Location

  public Intervention()
  {
    this.description = "";
    this.date = 0;
    this.category = "";

  }



  public String toString()
  { String _res_ = "(Intervention) ";
    _res_ = _res_ + description + ",";
    _res_ = _res_ + date + ",";
    _res_ = _res_ + category;
    return _res_;
  }

  public void setdescription(String description_x) { description = description_x;  }


  public static void setAlldescription(List interventions,String val)
{ for (int i = 0; i < interventions.size(); i++)
    { Intervention interventionx = (Intervention) interventions.get(i);
      Controller.inst().setdescription(interventionx,val); } }


  public void setdate(int date_x) { date = date_x;  }


  public static void setAlldate(List interventions,int val)
{ for (int i = 0; i < interventions.size(); i++)
    { Intervention interventionx = (Intervention) interventions.get(i);
      Controller.inst().setdate(interventionx,val); } }


  public void setcategory(String category_x) { category = category_x;  }


  public static void setAllcategory(List interventions,String val)
{ for (int i = 0; i < interventions.size(); i++)
    { Intervention interventionx = (Intervention) interventions.get(i);
      Controller.inst().setcategory(interventionx,val); } }


  public void setlocation(List locationxx) { if (locationxx.size() > 1) { return; } 
    location = locationxx;
  }
 
  public void addlocation(Location locationxx) { if (location.size() > 0) { return; } 
    location.add(locationxx);
    }
 
  public void removelocation(Location locationxx) { Vector _removedlocationlocationxx = new Vector();
  _removedlocationlocationxx.add(locationxx);
  location.removeAll(_removedlocationlocationxx);
    }

  public static void setAlllocation(List interventions,List _val)
  { for (int _i = 0; _i < interventions.size(); _i++)
    { Intervention interventionx = (Intervention) interventions.get(_i);
      Controller.inst().setlocation(interventionx, _val); } }

  public static void addAlllocation(List interventions,Location _val)
  { for (int _i = 0; _i < interventions.size(); _i++)
    { Intervention interventionx = (Intervention) interventions.get(_i);
      Controller.inst().addlocation(interventionx, _val); } }


  public static void removeAlllocation(List interventions,Location _val)
  { for (int _i = 0; _i < interventions.size(); _i++)
    { Intervention interventionx = (Intervention) interventions.get(_i);
      Controller.inst().removelocation(interventionx, _val); } }


  public static void unionAlllocation(List interventions, List _val)
  { for (int _i = 0; _i < interventions.size(); _i++)
    { Intervention interventionx = (Intervention) interventions.get(_i);
      Controller.inst().unionlocation(interventionx, _val); } }


  public static void subtractAlllocation(List interventions, List _val)
  { for (int _i = 0; _i < interventions.size(); _i++)
    { Intervention interventionx = (Intervention) interventions.get(_i);
      Controller.inst().subtractlocation(interventionx, _val); } }


  public String getdescription() { return description; }

  public static List getAlldescription(List interventions)
  { List result = new Vector();
    for (int i = 0; i < interventions.size(); i++)
    { Intervention interventionx = (Intervention) interventions.get(i);
      if (result.contains(interventionx.getdescription())) { }
      else { result.add(interventionx.getdescription()); } }
    return result; }

  public static List getAllOrdereddescription(List interventions)
  { List result = new Vector();
    for (int i = 0; i < interventions.size(); i++)
    { Intervention interventionx = (Intervention) interventions.get(i);
      result.add(interventionx.getdescription()); } 
    return result; }

  public int getdate() { return date; }

  public static List getAlldate(List interventions)
  { List result = new Vector();
    for (int i = 0; i < interventions.size(); i++)
    { Intervention interventionx = (Intervention) interventions.get(i);
      if (result.contains(new Integer(interventionx.getdate()))) { }
      else { result.add(new Integer(interventionx.getdate())); } }
    return result; }

  public static List getAllOrdereddate(List interventions)
  { List result = new Vector();
    for (int i = 0; i < interventions.size(); i++)
    { Intervention interventionx = (Intervention) interventions.get(i);
      result.add(new Integer(interventionx.getdate())); } 
    return result; }

  public String getcategory() { return category; }

  public static List getAllcategory(List interventions)
  { List result = new Vector();
    for (int i = 0; i < interventions.size(); i++)
    { Intervention interventionx = (Intervention) interventions.get(i);
      if (result.contains(interventionx.getcategory())) { }
      else { result.add(interventionx.getcategory()); } }
    return result; }

  public static List getAllOrderedcategory(List interventions)
  { List result = new Vector();
    for (int i = 0; i < interventions.size(); i++)
    { Intervention interventionx = (Intervention) interventions.get(i);
      result.add(interventionx.getcategory()); } 
    return result; }

  public List getlocation() { return (Vector) ((Vector) location).clone(); }

  public static List getAlllocation(List interventions)
  { List result = new Vector();
    for (int _i = 0; _i < interventions.size(); _i++)
    { Intervention interventionx = (Intervention) interventions.get(_i);
      result = Set.union(result,interventionx.getlocation()); }
    return result; }

  public static List getAllOrderedlocation(List interventions)
  { List result = new Vector();
    for (int _i = 0; _i < interventions.size(); _i++)
    { Intervention interventionx = (Intervention) interventions.get(_i);
      result = Set.union(result,interventionx.getlocation()); }
    return result; }


}


class Location
  implements SystemTypes
{
  private String description = ""; // internal
  private String postcode = ""; // internal

  public Location()
  {
    this.description = "";
    this.postcode = "";

  }



  public String toString()
  { String _res_ = "(Location) ";
    _res_ = _res_ + description + ",";
    _res_ = _res_ + postcode;
    return _res_;
  }

  public void setdescription(String description_x) { description = description_x;  }


  public static void setAlldescription(List locations,String val)
{ for (int i = 0; i < locations.size(); i++)
    { Location locationx = (Location) locations.get(i);
      Controller.inst().setdescription(locationx,val); } }


  public void setpostcode(String postcode_x) { postcode = postcode_x;  }


  public static void setAllpostcode(List locations,String val)
{ for (int i = 0; i < locations.size(); i++)
    { Location locationx = (Location) locations.get(i);
      Controller.inst().setpostcode(locationx,val); } }


  public String getdescription() { return description; }

  public static List getAlldescription(List locations)
  { List result = new Vector();
    for (int i = 0; i < locations.size(); i++)
    { Location locationx = (Location) locations.get(i);
      if (result.contains(locationx.getdescription())) { }
      else { result.add(locationx.getdescription()); } }
    return result; }

  public static List getAllOrdereddescription(List locations)
  { List result = new Vector();
    for (int i = 0; i < locations.size(); i++)
    { Location locationx = (Location) locations.get(i);
      result.add(locationx.getdescription()); } 
    return result; }

  public String getpostcode() { return postcode; }

  public static List getAllpostcode(List locations)
  { List result = new Vector();
    for (int i = 0; i < locations.size(); i++)
    { Location locationx = (Location) locations.get(i);
      if (result.contains(locationx.getpostcode())) { }
      else { result.add(locationx.getpostcode()); } }
    return result; }

  public static List getAllOrderedpostcode(List locations)
  { List result = new Vector();
    for (int i = 0; i < locations.size(); i++)
    { Location locationx = (Location) locations.get(i);
      result.add(locationx.getpostcode()); } 
    return result; }


}



public class Controller implements SystemTypes, ControllerInterface
{
  Vector patientgps = new Vector();
  Map patientgpIdindex = new HashMap(); // String --> PatientGP

  Vector doctors = new Vector();
  Map doctorstaffNumberindex = new HashMap(); // String --> Doctor

  Vector consultations = new Vector();
  Vector referrals = new Vector();
  Vector patienths = new Vector();
  Map patienthhospitalNumberindex = new HashMap(); // String --> PatientH

  Vector treatments = new Vector();
  Vector investigations = new Vector();
  Vector clinicians = new Vector();
  Map clinicianjobCodeindex = new HashMap(); // String --> Clinician

  Vector patients = new Vector();
  Map patientIdindex = new HashMap(); // String --> Patient

  Vector staffs = new Vector();
  Map staffstaffcodeindex = new HashMap(); // String --> Staff

  Vector interventions = new Vector();
  Vector locations = new Vector();
  private static Controller uniqueInstance; 


  private Controller() { } 


  public static Controller inst() 
    { if (uniqueInstance == null) 
    { uniqueInstance = new Controller(); }
    return uniqueInstance; } 


  public static void loadModel(String file)
  {
    try
    { BufferedReader br = null;
      File f = new File(file);
      try 
      { br = new BufferedReader(new FileReader(f)); }
      catch (Exception ex) 
      { System.err.println("No file: " + file); return; }
      Class cont = Class.forName("Controller");
      java.util.Map objectmap = new java.util.HashMap();
      while (true)
      { String line1;
        try { line1 = br.readLine(); }
        catch (Exception e)
        { return; }
        if (line1 == null)
        { return; }
        line1 = line1.trim();

        if (line1.length() == 0) { continue; }
        String left;
        String op;
        String right;
        if (line1.charAt(line1.length() - 1) == '"')
        { int eqind = line1.indexOf("="); 
          if (eqind == -1) { continue; }
          else 
          { left = line1.substring(0,eqind-1).trim();
            op = "="; 
            right = line1.substring(eqind+1,line1.length()).trim();
          }
        }
        else
        { StringTokenizer st1 = new StringTokenizer(line1);
          Vector vals1 = new Vector();
          while (st1.hasMoreTokens())
          { String val1 = st1.nextToken();
            vals1.add(val1);
          }
          if (vals1.size() < 3)
          { continue; }
          left = (String) vals1.get(0);
          op = (String) vals1.get(1);
          right = (String) vals1.get(2);
        }
        if (":".equals(op))
        { int i2 = right.indexOf(".");
          if (i2 == -1)
          { Class cl;
            try { cl = Class.forName("" + right); }
            catch (Exception _x) { System.err.println("No entity: " + right); continue; }
            Object xinst = cl.newInstance();
            objectmap.put(left,xinst);
            Class[] cargs = new Class[] { cl };
            Method addC = cont.getMethod("add" + right,cargs);
            if (addC == null) { continue; }
            Object[] args = new Object[] { xinst };
            addC.invoke(Controller.inst(),args);
          }
          else
          { String obj = right.substring(0,i2);
            String role = right.substring(i2+1,right.length());
            Object objinst = objectmap.get(obj); 
            if (objinst == null) 
            { continue; }
            Object val = objectmap.get(left);
            if (val == null) 
            { continue; }
            Class objC = objinst.getClass();
            Class typeclass = val.getClass(); 
            Object[] args = new Object[] { val }; 
            Class[] settypes = new Class[] { typeclass };
            Method addrole = Controller.findMethod(objC,"add" + role);
            if (addrole != null) 
            { addrole.invoke(objinst, args); }
            else { System.err.println("Error: cannot add to " + role); }
          }
        }
        else if ("=".equals(op))
        { int i1 = left.indexOf(".");
          if (i1 == -1) 
          { continue; }
          String obj = left.substring(0,i1);
          String att = left.substring(i1+1,left.length());
          Object objinst = objectmap.get(obj); 
          if (objinst == null) 
          { continue; }
          Class objC = objinst.getClass();
          Class typeclass; 
          Object val; 
          if (right.charAt(0) == '"' &&
              right.charAt(right.length() - 1) == '"')
          { typeclass = String.class;
            val = right.substring(1,right.length() - 1);
          } 
          else if ("true".equals(right) || "false".equals(right))
          { typeclass = boolean.class;
            if ("true".equals(right))
            { val = new Boolean(true); }
            else
            { val = new Boolean(false); }
          }
          else 
          { val = objectmap.get(right);
            if (val != null)
            { typeclass = val.getClass(); }
            else 
            { int i;
              double d;
              try 
              { i = Integer.parseInt(right);
                typeclass = int.class;
                val = new Integer(i); 
              }
              catch (Exception ee)
              { try
                { d = Double.parseDouble(right);
                  typeclass = double.class;
                  val = new Double(d);
                }
                catch (Exception ff)
                { continue; }
              }
            }
          }
          Object[] args = new Object[] { val }; 
          Class[] settypes = new Class[] { typeclass };
          Method setatt = Controller.findMethod(objC,"set" + att);
          if (setatt != null) 
          { setatt.invoke(objinst, args); }
          else { System.err.println("No attribute: " + att); }
        }
      }
    } catch (Exception e) { }
  }

  public static Method findMethod(Class c, String name)
  { Method[] mets = c.getMethods(); 
    for (int i = 0; i < mets.length; i++)
    { Method m = mets[i];
      if (m.getName().equals(name))
      { return m; }
    } 
    return null;
  }


  public void checkCompleteness()
  {   for (int _i = 0; _i < patientgps.size(); _i++)
  { PatientGP patientgp_x = (PatientGP) patientgps.get(_i);
    PatientGP patientgp_obj = (PatientGP) patientgpIdindex.get(patientgp_x.getId());
    if (patientgp_obj == patientgp_x) { }
    else if (patientgp_obj == null)
    { patientgpIdindex.put(patientgp_x.getId(),patientgp_x); }
    else
    { System.out.println("Error: multiple objects with id1 = " + patientgp_x.getId()); }
  }
  for (int _i = 0; _i < doctors.size(); _i++)
  { Doctor doctor_x = (Doctor) doctors.get(_i);
    Doctor doctor_obj = (Doctor) doctorstaffNumberindex.get(doctor_x.getstaffNumber());
    if (doctor_obj == doctor_x) { }
    else if (doctor_obj == null)
    { doctorstaffNumberindex.put(doctor_x.getstaffNumber(),doctor_x); }
    else
    { System.out.println("Error: multiple objects with id1 = " + doctor_x.getstaffNumber()); }
  }
  for (int _i = 0; _i < patienths.size(); _i++)
  { PatientH patienth_x = (PatientH) patienths.get(_i);
    PatientH patienth_obj = (PatientH) patienthhospitalNumberindex.get(patienth_x.gethospitalNumber());
    if (patienth_obj == patienth_x) { }
    else if (patienth_obj == null)
    { patienthhospitalNumberindex.put(patienth_x.gethospitalNumber(),patienth_x); }
    else
    { System.out.println("Error: multiple objects with id1 = " + patienth_x.gethospitalNumber()); }
  }
  for (int _i = 0; _i < clinicians.size(); _i++)
  { Clinician clinician_x = (Clinician) clinicians.get(_i);
    Clinician clinician_obj = (Clinician) clinicianjobCodeindex.get(clinician_x.getjobCode());
    if (clinician_obj == clinician_x) { }
    else if (clinician_obj == null)
    { clinicianjobCodeindex.put(clinician_x.getjobCode(),clinician_x); }
    else
    { System.out.println("Error: multiple objects with id1 = " + clinician_x.getjobCode()); }
  }
  for (int _i = 0; _i < patients.size(); _i++)
  { Patient patient_x = (Patient) patients.get(_i);
    Patient patient_obj = (Patient) patientIdindex.get(patient_x.getId());
    if (patient_obj == patient_x) { }
    else if (patient_obj == null)
    { patientIdindex.put(patient_x.getId(),patient_x); }
    else
    { System.out.println("Error: multiple objects with id1 = " + patient_x.getId()); }
  }
  for (int _i = 0; _i < staffs.size(); _i++)
  { Staff staff_x = (Staff) staffs.get(_i);
    Staff staff_obj = (Staff) staffstaffcodeindex.get(staff_x.getstaffcode());
    if (staff_obj == staff_x) { }
    else if (staff_obj == null)
    { staffstaffcodeindex.put(staff_x.getstaffcode(),staff_x); }
    else
    { System.out.println("Error: multiple objects with id1 = " + staff_x.getstaffcode()); }
  }
  }


  public void saveModel(String file)
  { File outfile = new File(file); 
    PrintWriter out; 
    try { out = new PrintWriter(new BufferedWriter(new FileWriter(outfile))); }
    catch (Exception e) { return; } 
  for (int _i = 0; _i < patientgps.size(); _i++)
  { PatientGP patientgpx_ = (PatientGP) patientgps.get(_i);
    out.println("patientgpx_" + _i + " : PatientGP");
    out.println("patientgpx_" + _i + ".Id = \"" + patientgpx_.getId() + "\"");
    out.println("patientgpx_" + _i + ".nhsNumber = \"" + patientgpx_.getnhsNumber() + "\"");
    out.println("patientgpx_" + _i + ".name1 = \"" + patientgpx_.getname1() + "\"");
    out.println("patientgpx_" + _i + ".name2 = \"" + patientgpx_.getname2() + "\"");
    out.println("patientgpx_" + _i + ".dob = " + patientgpx_.getdob());
    out.println("patientgpx_" + _i + ".addr1 = \"" + patientgpx_.getaddr1() + "\"");
    out.println("patientgpx_" + _i + ".addr2 = \"" + patientgpx_.getaddr2() + "\"");
    out.println("patientgpx_" + _i + ".postcode = \"" + patientgpx_.getpostcode() + "\"");
    out.println("patientgpx_" + _i + ".isMale = " + patientgpx_.getisMale());
  }

  for (int _i = 0; _i < doctors.size(); _i++)
  { Doctor doctorx_ = (Doctor) doctors.get(_i);
    out.println("doctorx_" + _i + " : Doctor");
    out.println("doctorx_" + _i + ".name1 = \"" + doctorx_.getname1() + "\"");
    out.println("doctorx_" + _i + ".name2 = \"" + doctorx_.getname2() + "\"");
    out.println("doctorx_" + _i + ".surgery = \"" + doctorx_.getsurgery() + "\"");
    out.println("doctorx_" + _i + ".staffNumber = \"" + doctorx_.getstaffNumber() + "\"");
  }

  for (int _i = 0; _i < consultations.size(); _i++)
  { Consultation consultationx_ = (Consultation) consultations.get(_i);
    out.println("consultationx_" + _i + " : Consultation");
    out.println("consultationx_" + _i + ".date = " + consultationx_.getdate());
    out.println("consultationx_" + _i + ".outcome = \"" + consultationx_.getoutcome() + "\"");
    out.println("consultationx_" + _i + ".symptoms = \"" + consultationx_.getsymptoms() + "\"");
  }

  for (int _i = 0; _i < referrals.size(); _i++)
  { Referral referralx_ = (Referral) referrals.get(_i);
    out.println("referralx_" + _i + " : Referral");
    out.println("referralx_" + _i + ".date = " + referralx_.getdate());
    out.println("referralx_" + _i + ".referredTo = \"" + referralx_.getreferredTo() + "\"");
  }

  for (int _i = 0; _i < patienths.size(); _i++)
  { PatientH patienthx_ = (PatientH) patienths.get(_i);
    out.println("patienthx_" + _i + " : PatientH");
    out.println("patienthx_" + _i + ".hospitalNumber = \"" + patienthx_.gethospitalNumber() + "\"");
    out.println("patienthx_" + _i + ".forename = \"" + patienthx_.getforename() + "\"");
    out.println("patienthx_" + _i + ".surname = \"" + patienthx_.getsurname() + "\"");
    out.println("patienthx_" + _i + ".ageyrs = " + patienthx_.getageyrs());
    out.println("patienthx_" + _i + ".agemnths = " + patienthx_.getagemnths());
    out.println("patienthx_" + _i + ".ward = \"" + patienthx_.getward() + "\"");
    out.println("patienthx_" + _i + ".bed = " + patienthx_.getbed());
    out.println("patienthx_" + _i + ".inpatient = " + patienthx_.getinpatient());
  }

  for (int _i = 0; _i < treatments.size(); _i++)
  { Treatment treatmentx_ = (Treatment) treatments.get(_i);
    out.println("treatmentx_" + _i + " : Treatment");
    out.println("treatmentx_" + _i + ".date = " + treatmentx_.getdate());
    out.println("treatmentx_" + _i + ".description = \"" + treatmentx_.getdescription() + "\"");
  }

  for (int _i = 0; _i < investigations.size(); _i++)
  { Investigation investigationx_ = (Investigation) investigations.get(_i);
    out.println("investigationx_" + _i + " : Investigation");
    out.println("investigationx_" + _i + ".description = \"" + investigationx_.getdescription() + "\"");
    out.println("investigationx_" + _i + ".result = \"" + investigationx_.getresult() + "\"");
  }

  for (int _i = 0; _i < clinicians.size(); _i++)
  { Clinician clinicianx_ = (Clinician) clinicians.get(_i);
    out.println("clinicianx_" + _i + " : Clinician");
    out.println("clinicianx_" + _i + ".name = \"" + clinicianx_.getname() + "\"");
    out.println("clinicianx_" + _i + ".jobTitle = \"" + clinicianx_.getjobTitle() + "\"");
    out.println("clinicianx_" + _i + ".jobCode = \"" + clinicianx_.getjobCode() + "\"");
  }

  for (int _i = 0; _i < patients.size(); _i++)
  { Patient patientx_ = (Patient) patients.get(_i);
    out.println("patientx_" + _i + " : Patient");
    out.println("patientx_" + _i + ".nhsNo = \"" + patientx_.getnhsNo() + "\"");
    out.println("patientx_" + _i + ".fname = \"" + patientx_.getfname() + "\"");
    out.println("patientx_" + _i + ".sname = \"" + patientx_.getsname() + "\"");
    out.println("patientx_" + _i + ".dob = " + patientx_.getdob());
    out.println("patientx_" + _i + ".address1 = \"" + patientx_.getaddress1() + "\"");
    out.println("patientx_" + _i + ".address2 = \"" + patientx_.getaddress2() + "\"");
    out.println("patientx_" + _i + ".Id = \"" + patientx_.getId() + "\"");
  }

  for (int _i = 0; _i < staffs.size(); _i++)
  { Staff staffx_ = (Staff) staffs.get(_i);
    out.println("staffx_" + _i + " : Staff");
    out.println("staffx_" + _i + ".fname = \"" + staffx_.getfname() + "\"");
    out.println("staffx_" + _i + ".sname = \"" + staffx_.getsname() + "\"");
    out.println("staffx_" + _i + ".staffcode = \"" + staffx_.getstaffcode() + "\"");
  }

  for (int _i = 0; _i < interventions.size(); _i++)
  { Intervention interventionx_ = (Intervention) interventions.get(_i);
    out.println("interventionx_" + _i + " : Intervention");
    out.println("interventionx_" + _i + ".description = \"" + interventionx_.getdescription() + "\"");
    out.println("interventionx_" + _i + ".date = " + interventionx_.getdate());
    out.println("interventionx_" + _i + ".category = \"" + interventionx_.getcategory() + "\"");
  }

  for (int _i = 0; _i < locations.size(); _i++)
  { Location locationx_ = (Location) locations.get(_i);
    out.println("locationx_" + _i + " : Location");
    out.println("locationx_" + _i + ".description = \"" + locationx_.getdescription() + "\"");
    out.println("locationx_" + _i + ".postcode = \"" + locationx_.getpostcode() + "\"");
  }

  for (int _i = 0; _i < patientgps.size(); _i++)
  { PatientGP patientgpx_ = (PatientGP) patientgps.get(_i);
    List patientgp_registeredWith_Doctor = patientgpx_.getregisteredWith();
    for (int _j = 0; _j < patientgp_registeredWith_Doctor.size(); _j++)
    { out.println("doctorx_" + doctors.indexOf(patientgp_registeredWith_Doctor.get(_j)) + " : patientgpx_" + _i + ".registeredWith");
    }
    List patientgp_consultations_Consultation = patientgpx_.getconsultations();
    for (int _j = 0; _j < patientgp_consultations_Consultation.size(); _j++)
    { out.println("consultationx_" + consultations.indexOf(patientgp_consultations_Consultation.get(_j)) + " : patientgpx_" + _i + ".consultations");
    }
    List patientgp_referrals_Referral = patientgpx_.getreferrals();
    for (int _j = 0; _j < patientgp_referrals_Referral.size(); _j++)
    { out.println("referralx_" + referrals.indexOf(patientgp_referrals_Referral.get(_j)) + " : patientgpx_" + _i + ".referrals");
    }
  }
  for (int _i = 0; _i < consultations.size(); _i++)
  { Consultation consultationx_ = (Consultation) consultations.get(_i);
    out.println("consultationx_" + _i + ".doctor = doctorx_" + doctors.indexOf(((Consultation) consultations.get(_i)).getdoctor()));
  }
  for (int _i = 0; _i < referrals.size(); _i++)
  { Referral referralx_ = (Referral) referrals.get(_i);
    out.println("referralx_" + _i + ".referrer = doctorx_" + doctors.indexOf(((Referral) referrals.get(_i)).getreferrer()));
  }
  for (int _i = 0; _i < patienths.size(); _i++)
  { PatientH patienthx_ = (PatientH) patienths.get(_i);
    List patienth_treatments_Treatment = patienthx_.gettreatments();
    for (int _j = 0; _j < patienth_treatments_Treatment.size(); _j++)
    { out.println("treatmentx_" + treatments.indexOf(patienth_treatments_Treatment.get(_j)) + " : patienthx_" + _i + ".treatments");
    }
    List patienth_investigations_Investigation = patienthx_.getinvestigations();
    for (int _j = 0; _j < patienth_investigations_Investigation.size(); _j++)
    { out.println("investigationx_" + investigations.indexOf(patienth_investigations_Investigation.get(_j)) + " : patienthx_" + _i + ".investigations");
    }
  }
  for (int _i = 0; _i < treatments.size(); _i++)
  { Treatment treatmentx_ = (Treatment) treatments.get(_i);
    List treatment_clinicians_Clinician = treatmentx_.getclinicians();
    for (int _j = 0; _j < treatment_clinicians_Clinician.size(); _j++)
    { out.println("clinicianx_" + clinicians.indexOf(treatment_clinicians_Clinician.get(_j)) + " : treatmentx_" + _i + ".clinicians");
    }
  }
  for (int _i = 0; _i < investigations.size(); _i++)
  { Investigation investigationx_ = (Investigation) investigations.get(_i);
    List investigation_clinicians_Clinician = investigationx_.getclinicians();
    for (int _j = 0; _j < investigation_clinicians_Clinician.size(); _j++)
    { out.println("clinicianx_" + clinicians.indexOf(investigation_clinicians_Clinician.get(_j)) + " : investigationx_" + _i + ".clinicians");
    }
  }
  for (int _i = 0; _i < patients.size(); _i++)
  { Patient patientx_ = (Patient) patients.get(_i);
    List patient_interventions_Intervention = patientx_.getinterventions();
    for (int _j = 0; _j < patient_interventions_Intervention.size(); _j++)
    { out.println("interventionx_" + interventions.indexOf(patient_interventions_Intervention.get(_j)) + " : patientx_" + _i + ".interventions");
    }
  }
  for (int _i = 0; _i < staffs.size(); _i++)
  { Staff staffx_ = (Staff) staffs.get(_i);
    List staff_interventions_Intervention = staffx_.getinterventions();
    for (int _j = 0; _j < staff_interventions_Intervention.size(); _j++)
    { out.println("interventionx_" + interventions.indexOf(staff_interventions_Intervention.get(_j)) + " : staffx_" + _i + ".interventions");
    }
  }
  for (int _i = 0; _i < interventions.size(); _i++)
  { Intervention interventionx_ = (Intervention) interventions.get(_i);
    List intervention_location_Location = interventionx_.getlocation();
    for (int _j = 0; _j < intervention_location_Location.size(); _j++)
    { out.println("locationx_" + locations.indexOf(intervention_location_Location.get(_j)) + " : interventionx_" + _i + ".location");
    }
  }
    out.close(); 
  }


  public void saveXSI(String file)
  { File outfile = new File(file); 
    PrintWriter out; 
    try { out = new PrintWriter(new BufferedWriter(new FileWriter(outfile))); }
    catch (Exception e) { return; } 
    out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    out.println("<My:model xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\">");
    for (int _i = 0; _i < patientgps.size(); _i++)
    { PatientGP patientgpx_ = (PatientGP) patientgps.get(_i);
       out.print("<patientgps xsi:type=\"My:PatientGP\"");
    out.print(" Id=\"" + patientgpx_.getId() + "\" ");
    out.print(" nhsNumber=\"" + patientgpx_.getnhsNumber() + "\" ");
    out.print(" name1=\"" + patientgpx_.getname1() + "\" ");
    out.print(" name2=\"" + patientgpx_.getname2() + "\" ");
    out.print(" dob=\"" + patientgpx_.getdob() + "\" ");
    out.print(" addr1=\"" + patientgpx_.getaddr1() + "\" ");
    out.print(" addr2=\"" + patientgpx_.getaddr2() + "\" ");
    out.print(" postcode=\"" + patientgpx_.getpostcode() + "\" ");
    out.print(" isMale=\"" + patientgpx_.getisMale() + "\" ");
    out.print(" registeredWith = \"");
    List patientgp_registeredWith = patientgpx_.getregisteredWith();
    for (int _j = 0; _j < patientgp_registeredWith.size(); _j++)
    { out.print(" //@doctors." + doctors.indexOf(patientgp_registeredWith.get(_j)));
    }
    out.print("\"");
    out.print(" consultations = \"");
    List patientgp_consultations = patientgpx_.getconsultations();
    for (int _j = 0; _j < patientgp_consultations.size(); _j++)
    { out.print(" //@consultations." + consultations.indexOf(patientgp_consultations.get(_j)));
    }
    out.print("\"");
    out.print(" referrals = \"");
    List patientgp_referrals = patientgpx_.getreferrals();
    for (int _j = 0; _j < patientgp_referrals.size(); _j++)
    { out.print(" //@referrals." + referrals.indexOf(patientgp_referrals.get(_j)));
    }
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < doctors.size(); _i++)
    { Doctor doctorx_ = (Doctor) doctors.get(_i);
       out.print("<doctors xsi:type=\"My:Doctor\"");
    out.print(" name1=\"" + doctorx_.getname1() + "\" ");
    out.print(" name2=\"" + doctorx_.getname2() + "\" ");
    out.print(" surgery=\"" + doctorx_.getsurgery() + "\" ");
    out.print(" staffNumber=\"" + doctorx_.getstaffNumber() + "\" ");
    out.println(" />");
  }

    for (int _i = 0; _i < consultations.size(); _i++)
    { Consultation consultationx_ = (Consultation) consultations.get(_i);
       out.print("<consultations xsi:type=\"My:Consultation\"");
    out.print(" date=\"" + consultationx_.getdate() + "\" ");
    out.print(" outcome=\"" + consultationx_.getoutcome() + "\" ");
    out.print(" symptoms=\"" + consultationx_.getsymptoms() + "\" ");
    out.print(" doctor=\"");
    out.print("//@doctors." + doctors.indexOf(((Consultation) consultations.get(_i)).getdoctor()));
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < referrals.size(); _i++)
    { Referral referralx_ = (Referral) referrals.get(_i);
       out.print("<referrals xsi:type=\"My:Referral\"");
    out.print(" date=\"" + referralx_.getdate() + "\" ");
    out.print(" referredTo=\"" + referralx_.getreferredTo() + "\" ");
    out.print(" referrer=\"");
    out.print("//@doctors." + doctors.indexOf(((Referral) referrals.get(_i)).getreferrer()));
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < patienths.size(); _i++)
    { PatientH patienthx_ = (PatientH) patienths.get(_i);
       out.print("<patienths xsi:type=\"My:PatientH\"");
    out.print(" hospitalNumber=\"" + patienthx_.gethospitalNumber() + "\" ");
    out.print(" forename=\"" + patienthx_.getforename() + "\" ");
    out.print(" surname=\"" + patienthx_.getsurname() + "\" ");
    out.print(" ageyrs=\"" + patienthx_.getageyrs() + "\" ");
    out.print(" agemnths=\"" + patienthx_.getagemnths() + "\" ");
    out.print(" ward=\"" + patienthx_.getward() + "\" ");
    out.print(" bed=\"" + patienthx_.getbed() + "\" ");
    out.print(" inpatient=\"" + patienthx_.getinpatient() + "\" ");
    out.print(" treatments = \"");
    List patienth_treatments = patienthx_.gettreatments();
    for (int _j = 0; _j < patienth_treatments.size(); _j++)
    { out.print(" //@treatments." + treatments.indexOf(patienth_treatments.get(_j)));
    }
    out.print("\"");
    out.print(" investigations = \"");
    List patienth_investigations = patienthx_.getinvestigations();
    for (int _j = 0; _j < patienth_investigations.size(); _j++)
    { out.print(" //@investigations." + investigations.indexOf(patienth_investigations.get(_j)));
    }
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < treatments.size(); _i++)
    { Treatment treatmentx_ = (Treatment) treatments.get(_i);
       out.print("<treatments xsi:type=\"My:Treatment\"");
    out.print(" date=\"" + treatmentx_.getdate() + "\" ");
    out.print(" description=\"" + treatmentx_.getdescription() + "\" ");
    out.print(" clinicians = \"");
    List treatment_clinicians = treatmentx_.getclinicians();
    for (int _j = 0; _j < treatment_clinicians.size(); _j++)
    { out.print(" //@clinicians." + clinicians.indexOf(treatment_clinicians.get(_j)));
    }
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < investigations.size(); _i++)
    { Investigation investigationx_ = (Investigation) investigations.get(_i);
       out.print("<investigations xsi:type=\"My:Investigation\"");
    out.print(" description=\"" + investigationx_.getdescription() + "\" ");
    out.print(" result=\"" + investigationx_.getresult() + "\" ");
    out.print(" clinicians = \"");
    List investigation_clinicians = investigationx_.getclinicians();
    for (int _j = 0; _j < investigation_clinicians.size(); _j++)
    { out.print(" //@clinicians." + clinicians.indexOf(investigation_clinicians.get(_j)));
    }
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < clinicians.size(); _i++)
    { Clinician clinicianx_ = (Clinician) clinicians.get(_i);
       out.print("<clinicians xsi:type=\"My:Clinician\"");
    out.print(" name=\"" + clinicianx_.getname() + "\" ");
    out.print(" jobTitle=\"" + clinicianx_.getjobTitle() + "\" ");
    out.print(" jobCode=\"" + clinicianx_.getjobCode() + "\" ");
    out.println(" />");
  }

    for (int _i = 0; _i < patients.size(); _i++)
    { Patient patientx_ = (Patient) patients.get(_i);
       out.print("<patients xsi:type=\"My:Patient\"");
    out.print(" nhsNo=\"" + patientx_.getnhsNo() + "\" ");
    out.print(" fname=\"" + patientx_.getfname() + "\" ");
    out.print(" sname=\"" + patientx_.getsname() + "\" ");
    out.print(" dob=\"" + patientx_.getdob() + "\" ");
    out.print(" address1=\"" + patientx_.getaddress1() + "\" ");
    out.print(" address2=\"" + patientx_.getaddress2() + "\" ");
    out.print(" Id=\"" + patientx_.getId() + "\" ");
    out.print(" interventions = \"");
    List patient_interventions = patientx_.getinterventions();
    for (int _j = 0; _j < patient_interventions.size(); _j++)
    { out.print(" //@interventions." + interventions.indexOf(patient_interventions.get(_j)));
    }
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < staffs.size(); _i++)
    { Staff staffx_ = (Staff) staffs.get(_i);
       out.print("<staffs xsi:type=\"My:Staff\"");
    out.print(" fname=\"" + staffx_.getfname() + "\" ");
    out.print(" sname=\"" + staffx_.getsname() + "\" ");
    out.print(" staffcode=\"" + staffx_.getstaffcode() + "\" ");
    out.print(" interventions = \"");
    List staff_interventions = staffx_.getinterventions();
    for (int _j = 0; _j < staff_interventions.size(); _j++)
    { out.print(" //@interventions." + interventions.indexOf(staff_interventions.get(_j)));
    }
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < interventions.size(); _i++)
    { Intervention interventionx_ = (Intervention) interventions.get(_i);
       out.print("<interventions xsi:type=\"My:Intervention\"");
    out.print(" description=\"" + interventionx_.getdescription() + "\" ");
    out.print(" date=\"" + interventionx_.getdate() + "\" ");
    out.print(" category=\"" + interventionx_.getcategory() + "\" ");
    out.print(" location = \"");
    List intervention_location = interventionx_.getlocation();
    for (int _j = 0; _j < intervention_location.size(); _j++)
    { out.print(" //@locations." + locations.indexOf(intervention_location.get(_j)));
    }
    out.print("\"");
    out.println(" />");
  }

    for (int _i = 0; _i < locations.size(); _i++)
    { Location locationx_ = (Location) locations.get(_i);
       out.print("<locations xsi:type=\"My:Location\"");
    out.print(" description=\"" + locationx_.getdescription() + "\" ");
    out.print(" postcode=\"" + locationx_.getpostcode() + "\" ");
    out.println(" />");
  }

    out.println("</My:model>");
    out.close(); 
  }



  public void addPatientGP(PatientGP oo) { patientgps.add(oo); }

  public PatientGP getPatientGPByPK(String Idx)
  {  return (PatientGP) patientgpIdindex.get(Idx); }

  public List getPatientGPByPK(List Idx)
  { Vector res = new Vector(); 
    for (int _i = 0; _i < Idx.size(); _i++)
    { PatientGP patientgpx = getPatientGPByPK((String) Idx.get(_i));
      if (patientgpx != null) { res.add(patientgpx); }
    }
    return res; 
  }

  public void addDoctor(Doctor oo) { doctors.add(oo); }

  public Doctor getDoctorByPK(String staffNumberx)
  {  return (Doctor) doctorstaffNumberindex.get(staffNumberx); }

  public List getDoctorByPK(List staffNumberx)
  { Vector res = new Vector(); 
    for (int _i = 0; _i < staffNumberx.size(); _i++)
    { Doctor doctorx = getDoctorByPK((String) staffNumberx.get(_i));
      if (doctorx != null) { res.add(doctorx); }
    }
    return res; 
  }

  public void addConsultation(Consultation oo) { consultations.add(oo); }

  public void addReferral(Referral oo) { referrals.add(oo); }

  public void addPatientH(PatientH oo) { patienths.add(oo); }

  public PatientH getPatientHByPK(String hospitalNumberx)
  {  return (PatientH) patienthhospitalNumberindex.get(hospitalNumberx); }

  public List getPatientHByPK(List hospitalNumberx)
  { Vector res = new Vector(); 
    for (int _i = 0; _i < hospitalNumberx.size(); _i++)
    { PatientH patienthx = getPatientHByPK((String) hospitalNumberx.get(_i));
      if (patienthx != null) { res.add(patienthx); }
    }
    return res; 
  }

  public void addTreatment(Treatment oo) { treatments.add(oo); }

  public void addInvestigation(Investigation oo) { investigations.add(oo); }

  public void addClinician(Clinician oo) { clinicians.add(oo); }

  public Clinician getClinicianByPK(String jobCodex)
  {  return (Clinician) clinicianjobCodeindex.get(jobCodex); }

  public List getClinicianByPK(List jobCodex)
  { Vector res = new Vector(); 
    for (int _i = 0; _i < jobCodex.size(); _i++)
    { Clinician clinicianx = getClinicianByPK((String) jobCodex.get(_i));
      if (clinicianx != null) { res.add(clinicianx); }
    }
    return res; 
  }

  public void addPatient(Patient oo) { patients.add(oo); }

  public Patient getPatientByPK(String Idx)
  {  return (Patient) patientIdindex.get(Idx); }

  public List getPatientByPK(List Idx)
  { Vector res = new Vector(); 
    for (int _i = 0; _i < Idx.size(); _i++)
    { Patient patientx = getPatientByPK((String) Idx.get(_i));
      if (patientx != null) { res.add(patientx); }
    }
    return res; 
  }

  public void addStaff(Staff oo) { staffs.add(oo); }

  public Staff getStaffByPK(String staffcodex)
  {  return (Staff) staffstaffcodeindex.get(staffcodex); }

  public List getStaffByPK(List staffcodex)
  { Vector res = new Vector(); 
    for (int _i = 0; _i < staffcodex.size(); _i++)
    { Staff staffx = getStaffByPK((String) staffcodex.get(_i));
      if (staffx != null) { res.add(staffx); }
    }
    return res; 
  }

  public void addIntervention(Intervention oo) { interventions.add(oo); }

  public void addLocation(Location oo) { locations.add(oo); }



  public void createAllPatientGP(List patientgpx)
  { for (int i = 0; i < patientgpx.size(); i++)
    { PatientGP patientgpx_x = (PatientGP) patientgpx.get(i);
      if (patientgpx_x == null) { patientgpx_x = new PatientGP(); }
      patientgpx.set(i,patientgpx_x);
      addPatientGP(patientgpx_x);
    }
  }


  public PatientGP createPatientGP(String Idx)
  { 
    if (patientgpIdindex.get(Idx) != null) { return null; }
    PatientGP patientgpx = new PatientGP();
    addPatientGP(patientgpx);
    setId(patientgpx,Idx);
    setnhsNumber(patientgpx,"");
    setname1(patientgpx,"");
    setname2(patientgpx,"");
    setdob(patientgpx,0);
    setaddr1(patientgpx,"");
    setaddr2(patientgpx,"");
    setpostcode(patientgpx,"");
    setisMale(patientgpx,false);
    setregisteredWith(patientgpx,new Vector());
    setconsultations(patientgpx,new Vector());
    setreferrals(patientgpx,new Vector());
    patientgpIdindex.put(Idx,patientgpx);

    return patientgpx;
  }

  public void createAllDoctor(List doctorx)
  { for (int i = 0; i < doctorx.size(); i++)
    { Doctor doctorx_x = (Doctor) doctorx.get(i);
      if (doctorx_x == null) { doctorx_x = new Doctor(); }
      doctorx.set(i,doctorx_x);
      addDoctor(doctorx_x);
    }
  }


  public Doctor createDoctor(String staffNumberx)
  { 
    if (doctorstaffNumberindex.get(staffNumberx) != null) { return null; }
    Doctor doctorx = new Doctor();
    addDoctor(doctorx);
    setname1(doctorx,"");
    setname2(doctorx,"");
    setsurgery(doctorx,"");
    setstaffNumber(doctorx,staffNumberx);
    doctorstaffNumberindex.put(staffNumberx,doctorx);

    return doctorx;
  }

  public void createAllConsultation(List consultationx)
  { for (int i = 0; i < consultationx.size(); i++)
    { Consultation consultationx_x = (Consultation) consultationx.get(i);
      if (consultationx_x == null) { consultationx_x = new Consultation(); }
      consultationx.set(i,consultationx_x);
      addConsultation(consultationx_x);
    }
  }


  public Consultation createConsultation(Doctor doctorx)
  { 
    Consultation consultationx = new Consultation(doctorx);
    addConsultation(consultationx);
    setdate(consultationx,0);
    setoutcome(consultationx,"");
    setsymptoms(consultationx,"");
    setdoctor(consultationx,doctorx);

    return consultationx;
  }

  public void createAllReferral(List referralx)
  { for (int i = 0; i < referralx.size(); i++)
    { Referral referralx_x = (Referral) referralx.get(i);
      if (referralx_x == null) { referralx_x = new Referral(); }
      referralx.set(i,referralx_x);
      addReferral(referralx_x);
    }
  }


  public Referral createReferral(Doctor referrerx)
  { 
    Referral referralx = new Referral(referrerx);
    addReferral(referralx);
    setdate(referralx,0);
    setreferredTo(referralx,"");
    setreferrer(referralx,referrerx);

    return referralx;
  }

  public void createAllPatientH(List patienthx)
  { for (int i = 0; i < patienthx.size(); i++)
    { PatientH patienthx_x = (PatientH) patienthx.get(i);
      if (patienthx_x == null) { patienthx_x = new PatientH(); }
      patienthx.set(i,patienthx_x);
      addPatientH(patienthx_x);
    }
  }


  public PatientH createPatientH(String hospitalNumberx)
  { 
    if (patienthhospitalNumberindex.get(hospitalNumberx) != null) { return null; }
    PatientH patienthx = new PatientH();
    addPatientH(patienthx);
    sethospitalNumber(patienthx,hospitalNumberx);
    setforename(patienthx,"");
    setsurname(patienthx,"");
    setageyrs(patienthx,0);
    setagemnths(patienthx,0);
    setward(patienthx,"");
    setbed(patienthx,0);
    setinpatient(patienthx,false);
    settreatments(patienthx,new Vector());
    setinvestigations(patienthx,new Vector());
    patienthhospitalNumberindex.put(hospitalNumberx,patienthx);

    return patienthx;
  }

  public void createAllTreatment(List treatmentx)
  { for (int i = 0; i < treatmentx.size(); i++)
    { Treatment treatmentx_x = (Treatment) treatmentx.get(i);
      if (treatmentx_x == null) { treatmentx_x = new Treatment(); }
      treatmentx.set(i,treatmentx_x);
      addTreatment(treatmentx_x);
    }
  }


  public Treatment createTreatment()
  { 
    Treatment treatmentx = new Treatment();
    addTreatment(treatmentx);
    setdate(treatmentx,0);
    setdescription(treatmentx,"");
    setclinicians(treatmentx,new Vector());

    return treatmentx;
  }

  public void createAllInvestigation(List investigationx)
  { for (int i = 0; i < investigationx.size(); i++)
    { Investigation investigationx_x = (Investigation) investigationx.get(i);
      if (investigationx_x == null) { investigationx_x = new Investigation(); }
      investigationx.set(i,investigationx_x);
      addInvestigation(investigationx_x);
    }
  }


  public Investigation createInvestigation()
  { 
    Investigation investigationx = new Investigation();
    addInvestigation(investigationx);
    setdescription(investigationx,"");
    setresult(investigationx,"");
    setclinicians(investigationx,new Vector());

    return investigationx;
  }

  public void createAllClinician(List clinicianx)
  { for (int i = 0; i < clinicianx.size(); i++)
    { Clinician clinicianx_x = (Clinician) clinicianx.get(i);
      if (clinicianx_x == null) { clinicianx_x = new Clinician(); }
      clinicianx.set(i,clinicianx_x);
      addClinician(clinicianx_x);
    }
  }


  public Clinician createClinician(String jobCodex)
  { 
    if (clinicianjobCodeindex.get(jobCodex) != null) { return null; }
    Clinician clinicianx = new Clinician();
    addClinician(clinicianx);
    setname(clinicianx,"");
    setjobTitle(clinicianx,"");
    setjobCode(clinicianx,jobCodex);
    clinicianjobCodeindex.put(jobCodex,clinicianx);

    return clinicianx;
  }

  public void createAllPatient(List patientx)
  { for (int i = 0; i < patientx.size(); i++)
    { Patient patientx_x = (Patient) patientx.get(i);
      if (patientx_x == null) { patientx_x = new Patient(); }
      patientx.set(i,patientx_x);
      addPatient(patientx_x);
    }
  }


  public Patient createPatient(String Idx)
  { 
    if (patientIdindex.get(Idx) != null) { return null; }
    Patient patientx = new Patient();
    addPatient(patientx);
    setnhsNo(patientx,"");
    setfname(patientx,"");
    setsname(patientx,"");
    setdob(patientx,0);
    setaddress1(patientx,"");
    setaddress2(patientx,"");
    setId(patientx,Idx);
    setinterventions(patientx,new Vector());
    patientIdindex.put(Idx,patientx);

    return patientx;
  }

  public void createAllStaff(List staffx)
  { for (int i = 0; i < staffx.size(); i++)
    { Staff staffx_x = (Staff) staffx.get(i);
      if (staffx_x == null) { staffx_x = new Staff(); }
      staffx.set(i,staffx_x);
      addStaff(staffx_x);
    }
  }


  public Staff createStaff(String staffcodex)
  { 
    if (staffstaffcodeindex.get(staffcodex) != null) { return null; }
    Staff staffx = new Staff();
    addStaff(staffx);
    setfname(staffx,"");
    setsname(staffx,"");
    setstaffcode(staffx,staffcodex);
    setinterventions(staffx,new Vector());
    staffstaffcodeindex.put(staffcodex,staffx);

    return staffx;
  }

  public void createAllIntervention(List interventionx)
  { for (int i = 0; i < interventionx.size(); i++)
    { Intervention interventionx_x = (Intervention) interventionx.get(i);
      if (interventionx_x == null) { interventionx_x = new Intervention(); }
      interventionx.set(i,interventionx_x);
      addIntervention(interventionx_x);
    }
  }


  public Intervention createIntervention()
  { 
    Intervention interventionx = new Intervention();
    addIntervention(interventionx);
    setdescription(interventionx,"");
    setdate(interventionx,0);
    setcategory(interventionx,"");
    setlocation(interventionx,new Vector());

    return interventionx;
  }

  public void createAllLocation(List locationx)
  { for (int i = 0; i < locationx.size(); i++)
    { Location locationx_x = (Location) locationx.get(i);
      if (locationx_x == null) { locationx_x = new Location(); }
      locationx.set(i,locationx_x);
      addLocation(locationx_x);
    }
  }


  public Location createLocation()
  { 
    Location locationx = new Location();
    addLocation(locationx);
    setdescription(locationx,"");
    setpostcode(locationx,"");

    return locationx;
  }


public void setId(PatientGP patientgpx, String Id_x) 
  { if (patientgpIdindex.get(Id_x) != null) { return; }
  patientgpIdindex.remove(patientgpx.getId());
  patientgpx.setId(Id_x);
  patientgpIdindex.put(Id_x,patientgpx);
    }


public void setnhsNumber(PatientGP patientgpx, String nhsNumber_x) 
  { patientgpx.setnhsNumber(nhsNumber_x);
    }


public void setname1(PatientGP patientgpx, String name1_x) 
  { patientgpx.setname1(name1_x);
    }


public void setname2(PatientGP patientgpx, String name2_x) 
  { patientgpx.setname2(name2_x);
    }


public void setdob(PatientGP patientgpx, int dob_x) 
  { patientgpx.setdob(dob_x);
    }


public void setaddr1(PatientGP patientgpx, String addr1_x) 
  { patientgpx.setaddr1(addr1_x);
    }


public void setaddr2(PatientGP patientgpx, String addr2_x) 
  { patientgpx.setaddr2(addr2_x);
    }


public void setpostcode(PatientGP patientgpx, String postcode_x) 
  { patientgpx.setpostcode(postcode_x);
    }


public void setisMale(PatientGP patientgpx, boolean isMale_x) 
  { patientgpx.setisMale(isMale_x);
    }


  public void setregisteredWith(PatientGP patientgpx, List registeredWithxx) 
  {     patientgpx.setregisteredWith(registeredWithxx);
      }


  public void addregisteredWith(PatientGP patientgpx, Doctor registeredWithxx) 
  { if (patientgpx.getregisteredWith().contains(registeredWithxx)) { return; }
      patientgpx.addregisteredWith(registeredWithxx);
    }


  public void removeregisteredWith(PatientGP patientgpx, Doctor registeredWithxx) 
  { patientgpx.removeregisteredWith(registeredWithxx);
    }


 public void unionregisteredWith(PatientGP patientgpx,List registeredWithx)
  { for (int _i = 0; _i < registeredWithx.size(); _i++)
    { Doctor doctorxregisteredWith = (Doctor) registeredWithx.get(_i);
      addregisteredWith(patientgpx,doctorxregisteredWith);
     } } 


 public void subtractregisteredWith(PatientGP patientgpx,List registeredWithx)
  { for (int _i = 0; _i < registeredWithx.size(); _i++)
    { Doctor doctorxregisteredWith = (Doctor) registeredWithx.get(_i);
      removeregisteredWith(patientgpx,doctorxregisteredWith);
     } } 


  public void setconsultations(PatientGP patientgpx, List consultationsxx) 
  {   List _oldconsultationsxx = patientgpx.getconsultations();
  for (int _i = 0; _i < consultationsxx.size(); _i++)
  { Consultation _xx = (Consultation) consultationsxx.get(_i);
    if (_oldconsultationsxx.contains(_xx)) { }
    else { PatientGP.removeAllconsultations(patientgps, _xx); }
  }
    patientgpx.setconsultations(consultationsxx);
      }


  public void addconsultations(PatientGP patientgpx, Consultation consultationsxx) 
  { if (patientgpx.getconsultations().contains(consultationsxx)) { return; }
    PatientGP.removeAllconsultations(patientgps,consultationsxx);
    patientgpx.addconsultations(consultationsxx);
    }


  public void removeconsultations(PatientGP patientgpx, Consultation consultationsxx) 
  { patientgpx.removeconsultations(consultationsxx);
    }


 public void unionconsultations(PatientGP patientgpx,List consultationsx)
  { for (int _i = 0; _i < consultationsx.size(); _i++)
    { Consultation consultationxconsultations = (Consultation) consultationsx.get(_i);
      addconsultations(patientgpx,consultationxconsultations);
     } } 


 public void subtractconsultations(PatientGP patientgpx,List consultationsx)
  { for (int _i = 0; _i < consultationsx.size(); _i++)
    { Consultation consultationxconsultations = (Consultation) consultationsx.get(_i);
      removeconsultations(patientgpx,consultationxconsultations);
     } } 


  public void setreferrals(PatientGP patientgpx, List referralsxx) 
  {   List _oldreferralsxx = patientgpx.getreferrals();
  for (int _i = 0; _i < referralsxx.size(); _i++)
  { Referral _xx = (Referral) referralsxx.get(_i);
    if (_oldreferralsxx.contains(_xx)) { }
    else { PatientGP.removeAllreferrals(patientgps, _xx); }
  }
    patientgpx.setreferrals(referralsxx);
      }


  public void addreferrals(PatientGP patientgpx, Referral referralsxx) 
  { if (patientgpx.getreferrals().contains(referralsxx)) { return; }
    PatientGP.removeAllreferrals(patientgps,referralsxx);
    patientgpx.addreferrals(referralsxx);
    }


  public void removereferrals(PatientGP patientgpx, Referral referralsxx) 
  { patientgpx.removereferrals(referralsxx);
    }


 public void unionreferrals(PatientGP patientgpx,List referralsx)
  { for (int _i = 0; _i < referralsx.size(); _i++)
    { Referral referralxreferrals = (Referral) referralsx.get(_i);
      addreferrals(patientgpx,referralxreferrals);
     } } 


 public void subtractreferrals(PatientGP patientgpx,List referralsx)
  { for (int _i = 0; _i < referralsx.size(); _i++)
    { Referral referralxreferrals = (Referral) referralsx.get(_i);
      removereferrals(patientgpx,referralxreferrals);
     } } 


public void setname1(Doctor doctorx, String name1_x) 
  { doctorx.setname1(name1_x);
    }


public void setname2(Doctor doctorx, String name2_x) 
  { doctorx.setname2(name2_x);
    }


public void setsurgery(Doctor doctorx, String surgery_x) 
  { doctorx.setsurgery(surgery_x);
    }


public void setstaffNumber(Doctor doctorx, String staffNumber_x) 
  { if (doctorstaffNumberindex.get(staffNumber_x) != null) { return; }
  doctorstaffNumberindex.remove(doctorx.getstaffNumber());
  doctorx.setstaffNumber(staffNumber_x);
  doctorstaffNumberindex.put(staffNumber_x,doctorx);
    }


public void setdate(Consultation consultationx, int date_x) 
  { consultationx.setdate(date_x);
    }


public void setoutcome(Consultation consultationx, String outcome_x) 
  { consultationx.setoutcome(outcome_x);
    }


public void setsymptoms(Consultation consultationx, String symptoms_x) 
  { consultationx.setsymptoms(symptoms_x);
    }


  public void setdoctor(Consultation consultationx, Doctor doctorxx) 
  {   if (consultationx.getdoctor() == doctorxx) { return; }
    consultationx.setdoctor(doctorxx);
      }


public void setdate(Referral referralx, int date_x) 
  { referralx.setdate(date_x);
    }


public void setreferredTo(Referral referralx, String referredTo_x) 
  { referralx.setreferredTo(referredTo_x);
    }


  public void setreferrer(Referral referralx, Doctor referrerxx) 
  {   if (referralx.getreferrer() == referrerxx) { return; }
    referralx.setreferrer(referrerxx);
      }


public void sethospitalNumber(PatientH patienthx, String hospitalNumber_x) 
  { if (patienthhospitalNumberindex.get(hospitalNumber_x) != null) { return; }
  patienthhospitalNumberindex.remove(patienthx.gethospitalNumber());
  patienthx.sethospitalNumber(hospitalNumber_x);
  patienthhospitalNumberindex.put(hospitalNumber_x,patienthx);
    }


public void setforename(PatientH patienthx, String forename_x) 
  { patienthx.setforename(forename_x);
    }


public void setsurname(PatientH patienthx, String surname_x) 
  { patienthx.setsurname(surname_x);
    }


public void setageyrs(PatientH patienthx, int ageyrs_x) 
  { patienthx.setageyrs(ageyrs_x);
    }


public void setagemnths(PatientH patienthx, int agemnths_x) 
  { patienthx.setagemnths(agemnths_x);
    }


public void setward(PatientH patienthx, String ward_x) 
  { patienthx.setward(ward_x);
    }


public void setbed(PatientH patienthx, int bed_x) 
  { patienthx.setbed(bed_x);
    }


public void setinpatient(PatientH patienthx, boolean inpatient_x) 
  { patienthx.setinpatient(inpatient_x);
    }


  public void settreatments(PatientH patienthx, List treatmentsxx) 
  {   List _oldtreatmentsxx = patienthx.gettreatments();
  for (int _i = 0; _i < treatmentsxx.size(); _i++)
  { Treatment _xx = (Treatment) treatmentsxx.get(_i);
    if (_oldtreatmentsxx.contains(_xx)) { }
    else { PatientH.removeAlltreatments(patienths, _xx); }
  }
    patienthx.settreatments(treatmentsxx);
      }


  public void settreatments(PatientH patienthx, int _ind, Treatment treatmentx) 
  { patienthx.settreatments(_ind,treatmentx); }
  
  public void addtreatments(PatientH patienthx, Treatment treatmentsxx) 
  {   PatientH.removeAlltreatments(patienths,treatmentsxx);
    patienthx.addtreatments(treatmentsxx);
    }


  public void removetreatments(PatientH patienthx, Treatment treatmentsxx) 
  { patienthx.removetreatments(treatmentsxx);
    }


 public void uniontreatments(PatientH patienthx,List treatmentsx)
  { for (int _i = 0; _i < treatmentsx.size(); _i++)
    { Treatment treatmentxtreatments = (Treatment) treatmentsx.get(_i);
      addtreatments(patienthx,treatmentxtreatments);
     } } 


 public void subtracttreatments(PatientH patienthx,List treatmentsx)
  { for (int _i = 0; _i < treatmentsx.size(); _i++)
    { Treatment treatmentxtreatments = (Treatment) treatmentsx.get(_i);
      removetreatments(patienthx,treatmentxtreatments);
     } } 


  public void setinvestigations(PatientH patienthx, List investigationsxx) 
  {   List _oldinvestigationsxx = patienthx.getinvestigations();
  for (int _i = 0; _i < investigationsxx.size(); _i++)
  { Investigation _xx = (Investigation) investigationsxx.get(_i);
    if (_oldinvestigationsxx.contains(_xx)) { }
    else { PatientH.removeAllinvestigations(patienths, _xx); }
  }
    patienthx.setinvestigations(investigationsxx);
      }


  public void addinvestigations(PatientH patienthx, Investigation investigationsxx) 
  { if (patienthx.getinvestigations().contains(investigationsxx)) { return; }
    PatientH.removeAllinvestigations(patienths,investigationsxx);
    patienthx.addinvestigations(investigationsxx);
    }


  public void removeinvestigations(PatientH patienthx, Investigation investigationsxx) 
  { patienthx.removeinvestigations(investigationsxx);
    }


 public void unioninvestigations(PatientH patienthx,List investigationsx)
  { for (int _i = 0; _i < investigationsx.size(); _i++)
    { Investigation investigationxinvestigations = (Investigation) investigationsx.get(_i);
      addinvestigations(patienthx,investigationxinvestigations);
     } } 


 public void subtractinvestigations(PatientH patienthx,List investigationsx)
  { for (int _i = 0; _i < investigationsx.size(); _i++)
    { Investigation investigationxinvestigations = (Investigation) investigationsx.get(_i);
      removeinvestigations(patienthx,investigationxinvestigations);
     } } 


public void setdate(Treatment treatmentx, int date_x) 
  { treatmentx.setdate(date_x);
    }


public void setdescription(Treatment treatmentx, String description_x) 
  { treatmentx.setdescription(description_x);
    }


  public void setclinicians(Treatment treatmentx, List cliniciansxx) 
  {     treatmentx.setclinicians(cliniciansxx);
      }


  public void addclinicians(Treatment treatmentx, Clinician cliniciansxx) 
  { if (treatmentx.getclinicians().contains(cliniciansxx)) { return; }
      treatmentx.addclinicians(cliniciansxx);
    }


  public void removeclinicians(Treatment treatmentx, Clinician cliniciansxx) 
  { treatmentx.removeclinicians(cliniciansxx);
    }


 public void unionclinicians(Treatment treatmentx,List cliniciansx)
  { for (int _i = 0; _i < cliniciansx.size(); _i++)
    { Clinician clinicianxclinicians = (Clinician) cliniciansx.get(_i);
      addclinicians(treatmentx,clinicianxclinicians);
     } } 


 public void subtractclinicians(Treatment treatmentx,List cliniciansx)
  { for (int _i = 0; _i < cliniciansx.size(); _i++)
    { Clinician clinicianxclinicians = (Clinician) cliniciansx.get(_i);
      removeclinicians(treatmentx,clinicianxclinicians);
     } } 


public void setdescription(Investigation investigationx, String description_x) 
  { investigationx.setdescription(description_x);
    }


public void setresult(Investigation investigationx, String result_x) 
  { investigationx.setresult(result_x);
    }


  public void setclinicians(Investigation investigationx, List cliniciansxx) 
  {     investigationx.setclinicians(cliniciansxx);
      }


  public void addclinicians(Investigation investigationx, Clinician cliniciansxx) 
  { if (investigationx.getclinicians().contains(cliniciansxx)) { return; }
      investigationx.addclinicians(cliniciansxx);
    }


  public void removeclinicians(Investigation investigationx, Clinician cliniciansxx) 
  { investigationx.removeclinicians(cliniciansxx);
    }


 public void unionclinicians(Investigation investigationx,List cliniciansx)
  { for (int _i = 0; _i < cliniciansx.size(); _i++)
    { Clinician clinicianxclinicians = (Clinician) cliniciansx.get(_i);
      addclinicians(investigationx,clinicianxclinicians);
     } } 


 public void subtractclinicians(Investigation investigationx,List cliniciansx)
  { for (int _i = 0; _i < cliniciansx.size(); _i++)
    { Clinician clinicianxclinicians = (Clinician) cliniciansx.get(_i);
      removeclinicians(investigationx,clinicianxclinicians);
     } } 


public void setname(Clinician clinicianx, String name_x) 
  { clinicianx.setname(name_x);
    }


public void setjobTitle(Clinician clinicianx, String jobTitle_x) 
  { clinicianx.setjobTitle(jobTitle_x);
    }


public void setjobCode(Clinician clinicianx, String jobCode_x) 
  { if (clinicianjobCodeindex.get(jobCode_x) != null) { return; }
  clinicianjobCodeindex.remove(clinicianx.getjobCode());
  clinicianx.setjobCode(jobCode_x);
  clinicianjobCodeindex.put(jobCode_x,clinicianx);
    }


public void setnhsNo(Patient patientx, String nhsNo_x) 
  { patientx.setnhsNo(nhsNo_x);
    }


public void setfname(Patient patientx, String fname_x) 
  { patientx.setfname(fname_x);
    }


public void setsname(Patient patientx, String sname_x) 
  { patientx.setsname(sname_x);
    }


public void setdob(Patient patientx, int dob_x) 
  { patientx.setdob(dob_x);
    }


public void setaddress1(Patient patientx, String address1_x) 
  { patientx.setaddress1(address1_x);
    }


public void setaddress2(Patient patientx, String address2_x) 
  { patientx.setaddress2(address2_x);
    }


public void setId(Patient patientx, String Id_x) 
  { if (patientIdindex.get(Id_x) != null) { return; }
  patientIdindex.remove(patientx.getId());
  patientx.setId(Id_x);
  patientIdindex.put(Id_x,patientx);
    }


  public void setinterventions(Patient patientx, List interventionsxx) 
  {   List _oldinterventionsxx = patientx.getinterventions();
  for (int _i = 0; _i < interventionsxx.size(); _i++)
  { Intervention _xx = (Intervention) interventionsxx.get(_i);
    if (_oldinterventionsxx.contains(_xx)) { }
    else { Patient.removeAllinterventions(patients, _xx); }
  }
    patientx.setinterventions(interventionsxx);
      }


  public void addinterventions(Patient patientx, Intervention interventionsxx) 
  { if (patientx.getinterventions().contains(interventionsxx)) { return; }
    Patient.removeAllinterventions(patients,interventionsxx);
    patientx.addinterventions(interventionsxx);
    }


  public void removeinterventions(Patient patientx, Intervention interventionsxx) 
  { patientx.removeinterventions(interventionsxx);
    }


 public void unioninterventions(Patient patientx,List interventionsx)
  { for (int _i = 0; _i < interventionsx.size(); _i++)
    { Intervention interventionxinterventions = (Intervention) interventionsx.get(_i);
      addinterventions(patientx,interventionxinterventions);
     } } 


 public void subtractinterventions(Patient patientx,List interventionsx)
  { for (int _i = 0; _i < interventionsx.size(); _i++)
    { Intervention interventionxinterventions = (Intervention) interventionsx.get(_i);
      removeinterventions(patientx,interventionxinterventions);
     } } 


public void setfname(Staff staffx, String fname_x) 
  { staffx.setfname(fname_x);
    }


public void setsname(Staff staffx, String sname_x) 
  { staffx.setsname(sname_x);
    }


public void setstaffcode(Staff staffx, String staffcode_x) 
  { if (staffstaffcodeindex.get(staffcode_x) != null) { return; }
  staffstaffcodeindex.remove(staffx.getstaffcode());
  staffx.setstaffcode(staffcode_x);
  staffstaffcodeindex.put(staffcode_x,staffx);
    }


  public void setinterventions(Staff staffx, List interventionsxx) 
  {     staffx.setinterventions(interventionsxx);
      }


  public void addinterventions(Staff staffx, Intervention interventionsxx) 
  { if (staffx.getinterventions().contains(interventionsxx)) { return; }
      staffx.addinterventions(interventionsxx);
    }


  public void removeinterventions(Staff staffx, Intervention interventionsxx) 
  { staffx.removeinterventions(interventionsxx);
    }


 public void unioninterventions(Staff staffx,List interventionsx)
  { for (int _i = 0; _i < interventionsx.size(); _i++)
    { Intervention interventionxinterventions = (Intervention) interventionsx.get(_i);
      addinterventions(staffx,interventionxinterventions);
     } } 


 public void subtractinterventions(Staff staffx,List interventionsx)
  { for (int _i = 0; _i < interventionsx.size(); _i++)
    { Intervention interventionxinterventions = (Intervention) interventionsx.get(_i);
      removeinterventions(staffx,interventionxinterventions);
     } } 


public void setdescription(Intervention interventionx, String description_x) 
  { interventionx.setdescription(description_x);
    }


public void setdate(Intervention interventionx, int date_x) 
  { interventionx.setdate(date_x);
    }


public void setcategory(Intervention interventionx, String category_x) 
  { interventionx.setcategory(category_x);
    }


  public void setlocation(Intervention interventionx, List locationxx) 
  {   if (locationxx.size() > 1) { return; }
    interventionx.setlocation(locationxx);
      }


  public void addlocation(Intervention interventionx, Location locationxx) 
  { if (interventionx.getlocation().contains(locationxx)) { return; }
      interventionx.addlocation(locationxx);
    }


  public void removelocation(Intervention interventionx, Location locationxx) 
  { interventionx.removelocation(locationxx);
    }


 public void unionlocation(Intervention interventionx,List locationx)
  { for (int _i = 0; _i < locationx.size(); _i++)
    { Location locationxlocation = (Location) locationx.get(_i);
      addlocation(interventionx,locationxlocation);
     } } 


 public void subtractlocation(Intervention interventionx,List locationx)
  { for (int _i = 0; _i < locationx.size(); _i++)
    { Location locationxlocation = (Location) locationx.get(_i);
      removelocation(interventionx,locationxlocation);
     } } 


public void setdescription(Location locationx, String description_x) 
  { locationx.setdescription(description_x);
    }


public void setpostcode(Location locationx, String postcode_x) 
  { locationx.setpostcode(postcode_x);
    }



  public  List AllPatientGPtoString(List patientgpxs)
  { 
    List result = new Vector();
    for (int i = 0; i < patientgpxs.size(); i++)
    { PatientGP patientgpx = (PatientGP) patientgpxs.get(i);
      result.add(patientgpx.toString());
    }
    return result; 
  }

  public void check1(PatientGP patientgpx)
  {   patientgpx.check1();
   }

  public void check2(PatientGP patientgpx)
  {   patientgpx.check2();
   }

  public void check3(PatientGP patientgpx)
  {   patientgpx.check3();
   }

  public void check4(PatientGP patientgpx)
  {   patientgpx.check4();
   }

  public void check5(PatientGP patientgpx)
  {   patientgpx.check5();
   }

  public void check6(PatientGP patientgpx,PatientGP p)
  {   patientgpx.check6(p);
   }

  public void check6outer(PatientGP patientgpx)
  {   patientgpx.check6outer();
   }

  public void task21(PatientGP patientgpx)
  {   patientgpx.task21();
   }

  public void task22(PatientGP patientgpx)
  {   patientgpx.task22();
   }

  public void migrategp1(PatientGP patientgpx)
  {   patientgpx.migrategp1();
   }

  public void migrategp2(PatientGP patientgpx)
  {   patientgpx.migrategp2();
   }

  public void task31(PatientGP patientgpx)
  {   patientgpx.task31();
   }

  public  List AllConsultationtoString(List consultationxs)
  { 
    List result = new Vector();
    for (int i = 0; i < consultationxs.size(); i++)
    { Consultation consultationx = (Consultation) consultationxs.get(i);
      result.add(consultationx.toString());
    }
    return result; 
  }



  public void killAllPatientGP(List patientgpxx)
  { for (int _i = 0; _i < patientgpxx.size(); _i++)
    { killPatientGP((PatientGP) patientgpxx.get(_i)); }
  }

  public void killPatientGP(PatientGP patientgpxx)
  { patientgps.remove(patientgpxx);
    patientgpIdindex.remove(patientgpxx.getId());
  }



  public void killAllDoctor(List doctorxx)
  { for (int _i = 0; _i < doctorxx.size(); _i++)
    { killDoctor((Doctor) doctorxx.get(_i)); }
  }

  public void killDoctor(Doctor doctorxx)
  { doctors.remove(doctorxx);
    Vector _1removeddoctorConsultation = new Vector();
    Vector _1removedreferrerReferral = new Vector();
    Vector _1qrangeregisteredWithPatientGP = new Vector();
    _1qrangeregisteredWithPatientGP.addAll(patientgps);
    for (int _i = 0; _i < _1qrangeregisteredWithPatientGP.size(); _i++)
    { PatientGP patientgpx = (PatientGP) _1qrangeregisteredWithPatientGP.get(_i);
      if (patientgpx.getregisteredWith().contains(doctorxx))
      { removeregisteredWith(patientgpx,doctorxx); }
    }
    Vector _1qrangedoctorConsultation = new Vector();
    _1qrangedoctorConsultation.addAll(consultations);
    for (int _i = 0; _i < _1qrangedoctorConsultation.size(); _i++)
    { Consultation consultationx = (Consultation) _1qrangedoctorConsultation.get(_i);
      if (consultationx != null && doctorxx.equals(consultationx.getdoctor()))
      { _1removeddoctorConsultation.add(consultationx);
        consultationx.setdoctor(null);
      }
    }
    Vector _1qrangereferrerReferral = new Vector();
    _1qrangereferrerReferral.addAll(referrals);
    for (int _i = 0; _i < _1qrangereferrerReferral.size(); _i++)
    { Referral referralx = (Referral) _1qrangereferrerReferral.get(_i);
      if (referralx != null && doctorxx.equals(referralx.getreferrer()))
      { _1removedreferrerReferral.add(referralx);
        referralx.setreferrer(null);
      }
    }
    doctorstaffNumberindex.remove(doctorxx.getstaffNumber());
    for (int _i = 0; _i < _1removeddoctorConsultation.size(); _i++)
    { killConsultation((Consultation) _1removeddoctorConsultation.get(_i)); }
    for (int _i = 0; _i < _1removedreferrerReferral.size(); _i++)
    { killReferral((Referral) _1removedreferrerReferral.get(_i)); }
  }



  public void killAllConsultation(List consultationxx)
  { for (int _i = 0; _i < consultationxx.size(); _i++)
    { killConsultation((Consultation) consultationxx.get(_i)); }
  }

  public void killConsultation(Consultation consultationxx)
  { consultations.remove(consultationxx);
    Vector _1qrangeconsultationsPatientGP = new Vector();
    _1qrangeconsultationsPatientGP.addAll(patientgps);
    for (int _i = 0; _i < _1qrangeconsultationsPatientGP.size(); _i++)
    { PatientGP patientgpx = (PatientGP) _1qrangeconsultationsPatientGP.get(_i);
      if (patientgpx.getconsultations().contains(consultationxx))
      { removeconsultations(patientgpx,consultationxx); }
    }
  }



  public void killAllReferral(List referralxx)
  { for (int _i = 0; _i < referralxx.size(); _i++)
    { killReferral((Referral) referralxx.get(_i)); }
  }

  public void killReferral(Referral referralxx)
  { referrals.remove(referralxx);
    Vector _1qrangereferralsPatientGP = new Vector();
    _1qrangereferralsPatientGP.addAll(patientgps);
    for (int _i = 0; _i < _1qrangereferralsPatientGP.size(); _i++)
    { PatientGP patientgpx = (PatientGP) _1qrangereferralsPatientGP.get(_i);
      if (patientgpx.getreferrals().contains(referralxx))
      { removereferrals(patientgpx,referralxx); }
    }
  }



  public void killAllPatientH(List patienthxx)
  { for (int _i = 0; _i < patienthxx.size(); _i++)
    { killPatientH((PatientH) patienthxx.get(_i)); }
  }

  public void killPatientH(PatientH patienthxx)
  { patienths.remove(patienthxx);
    patienthhospitalNumberindex.remove(patienthxx.gethospitalNumber());
  }



  public void killAllTreatment(List treatmentxx)
  { for (int _i = 0; _i < treatmentxx.size(); _i++)
    { killTreatment((Treatment) treatmentxx.get(_i)); }
  }

  public void killTreatment(Treatment treatmentxx)
  { treatments.remove(treatmentxx);
    Vector _1qrangetreatmentsPatientH = new Vector();
    _1qrangetreatmentsPatientH.addAll(patienths);
    for (int _i = 0; _i < _1qrangetreatmentsPatientH.size(); _i++)
    { PatientH patienthx = (PatientH) _1qrangetreatmentsPatientH.get(_i);
      if (patienthx.gettreatments().contains(treatmentxx))
      { removetreatments(patienthx,treatmentxx); }
    }
  }



  public void killAllInvestigation(List investigationxx)
  { for (int _i = 0; _i < investigationxx.size(); _i++)
    { killInvestigation((Investigation) investigationxx.get(_i)); }
  }

  public void killInvestigation(Investigation investigationxx)
  { investigations.remove(investigationxx);
    Vector _1qrangeinvestigationsPatientH = new Vector();
    _1qrangeinvestigationsPatientH.addAll(patienths);
    for (int _i = 0; _i < _1qrangeinvestigationsPatientH.size(); _i++)
    { PatientH patienthx = (PatientH) _1qrangeinvestigationsPatientH.get(_i);
      if (patienthx.getinvestigations().contains(investigationxx))
      { removeinvestigations(patienthx,investigationxx); }
    }
  }



  public void killAllClinician(List clinicianxx)
  { for (int _i = 0; _i < clinicianxx.size(); _i++)
    { killClinician((Clinician) clinicianxx.get(_i)); }
  }

  public void killClinician(Clinician clinicianxx)
  { clinicians.remove(clinicianxx);
    Vector _1qrangecliniciansInvestigation = new Vector();
    _1qrangecliniciansInvestigation.addAll(investigations);
    for (int _i = 0; _i < _1qrangecliniciansInvestigation.size(); _i++)
    { Investigation investigationx = (Investigation) _1qrangecliniciansInvestigation.get(_i);
      if (investigationx.getclinicians().contains(clinicianxx))
      { removeclinicians(investigationx,clinicianxx); }
    }
    Vector _1qrangecliniciansTreatment = new Vector();
    _1qrangecliniciansTreatment.addAll(treatments);
    for (int _i = 0; _i < _1qrangecliniciansTreatment.size(); _i++)
    { Treatment treatmentx = (Treatment) _1qrangecliniciansTreatment.get(_i);
      if (treatmentx.getclinicians().contains(clinicianxx))
      { removeclinicians(treatmentx,clinicianxx); }
    }
    clinicianjobCodeindex.remove(clinicianxx.getjobCode());
  }



  public void killAllPatient(List patientxx)
  { for (int _i = 0; _i < patientxx.size(); _i++)
    { killPatient((Patient) patientxx.get(_i)); }
  }

  public void killPatient(Patient patientxx)
  { patients.remove(patientxx);
    patientIdindex.remove(patientxx.getId());
  }



  public void killAllStaff(List staffxx)
  { for (int _i = 0; _i < staffxx.size(); _i++)
    { killStaff((Staff) staffxx.get(_i)); }
  }

  public void killStaff(Staff staffxx)
  { staffs.remove(staffxx);
    staffstaffcodeindex.remove(staffxx.getstaffcode());
  }



  public void killAllIntervention(List interventionxx)
  { for (int _i = 0; _i < interventionxx.size(); _i++)
    { killIntervention((Intervention) interventionxx.get(_i)); }
  }

  public void killIntervention(Intervention interventionxx)
  { interventions.remove(interventionxx);
    Vector _1qrangeinterventionsPatient = new Vector();
    _1qrangeinterventionsPatient.addAll(patients);
    for (int _i = 0; _i < _1qrangeinterventionsPatient.size(); _i++)
    { Patient patientx = (Patient) _1qrangeinterventionsPatient.get(_i);
      if (patientx.getinterventions().contains(interventionxx))
      { removeinterventions(patientx,interventionxx); }
    }
    Vector _1qrangeinterventionsStaff = new Vector();
    _1qrangeinterventionsStaff.addAll(staffs);
    for (int _i = 0; _i < _1qrangeinterventionsStaff.size(); _i++)
    { Staff staffx = (Staff) _1qrangeinterventionsStaff.get(_i);
      if (staffx.getinterventions().contains(interventionxx))
      { removeinterventions(staffx,interventionxx); }
    }
  }



  public void killAllLocation(List locationxx)
  { for (int _i = 0; _i < locationxx.size(); _i++)
    { killLocation((Location) locationxx.get(_i)); }
  }

  public void killLocation(Location locationxx)
  { locations.remove(locationxx);
    Vector _1qrangelocationIntervention = new Vector();
    _1qrangelocationIntervention.addAll(interventions);
    for (int _i = 0; _i < _1qrangelocationIntervention.size(); _i++)
    { Intervention interventionx = (Intervention) _1qrangelocationIntervention.get(_i);
      if (interventionx.getlocation().contains(locationxx))
      { removelocation(interventionx,locationxx); }
    }
  }




  
    public void check() 
  { 

       List patientgpcheck1x = new Vector();
  patientgpcheck1x.addAll(Controller.inst().patientgps);
  for (int patientgpcheck1x_ind3 = 0; patientgpcheck1x_ind3 < patientgpcheck1x.size(); patientgpcheck1x_ind3++)
  { Controller.inst().check1((PatientGP) patientgpcheck1x.get(patientgpcheck1x_ind3)); }

       List patientgpcheck2x = new Vector();
  patientgpcheck2x.addAll(Controller.inst().patientgps);
  for (int patientgpcheck2x_ind4 = 0; patientgpcheck2x_ind4 < patientgpcheck2x.size(); patientgpcheck2x_ind4++)
  { Controller.inst().check2((PatientGP) patientgpcheck2x.get(patientgpcheck2x_ind4)); }

       List patientgpcheck3x = new Vector();
  patientgpcheck3x.addAll(Controller.inst().patientgps);
  for (int patientgpcheck3x_ind5 = 0; patientgpcheck3x_ind5 < patientgpcheck3x.size(); patientgpcheck3x_ind5++)
  { Controller.inst().check3((PatientGP) patientgpcheck3x.get(patientgpcheck3x_ind5)); }

       List patientgpcheck4x = new Vector();
  patientgpcheck4x.addAll(Controller.inst().patientgps);
  for (int patientgpcheck4x_ind6 = 0; patientgpcheck4x_ind6 < patientgpcheck4x.size(); patientgpcheck4x_ind6++)
  { Controller.inst().check4((PatientGP) patientgpcheck4x.get(patientgpcheck4x_ind6)); }

       List patientgpcheck5x = new Vector();
  patientgpcheck5x.addAll(Controller.inst().patientgps);
  for (int patientgpcheck5x_ind7 = 0; patientgpcheck5x_ind7 < patientgpcheck5x.size(); patientgpcheck5x_ind7++)
  { Controller.inst().check5((PatientGP) patientgpcheck5x.get(patientgpcheck5x_ind7)); }

       List patientgpcheck6outerx = new Vector();
  patientgpcheck6outerx.addAll(Controller.inst().patientgps);
  for (int patientgpcheck6outerx_ind8 = 0; patientgpcheck6outerx_ind8 < patientgpcheck6outerx.size(); patientgpcheck6outerx_ind8++)
  { Controller.inst().check6outer((PatientGP) patientgpcheck6outerx.get(patientgpcheck6outerx_ind8)); }


  }



    public void task2() 
  { 

       List patientgptask21x = new Vector();
  patientgptask21x.addAll(Controller.inst().patientgps);
  for (int patientgptask21x_ind9 = 0; patientgptask21x_ind9 < patientgptask21x.size(); patientgptask21x_ind9++)
  { Controller.inst().task21((PatientGP) patientgptask21x.get(patientgptask21x_ind9)); }

       List patientgptask22x = new Vector();
  patientgptask22x.addAll(Controller.inst().patientgps);
  for (int patientgptask22x_ind10 = 0; patientgptask22x_ind10 < patientgptask22x.size(); patientgptask22x_ind10++)
  { Controller.inst().task22((PatientGP) patientgptask22x.get(patientgptask22x_ind10)); }


  }



    public void migrateGP() 
  { 

       List patientgpmigrategp1x = new Vector();
  patientgpmigrategp1x.addAll(Controller.inst().patientgps);
  for (int patientgpmigrategp1x_ind11 = 0; patientgpmigrategp1x_ind11 < patientgpmigrategp1x.size(); patientgpmigrategp1x_ind11++)
  { Controller.inst().migrategp1((PatientGP) patientgpmigrategp1x.get(patientgpmigrategp1x_ind11)); }

       List patientgpmigrategp2x = new Vector();
  patientgpmigrategp2x.addAll(Controller.inst().patientgps);
  for (int patientgpmigrategp2x_ind12 = 0; patientgpmigrategp2x_ind12 < patientgpmigrategp2x.size(); patientgpmigrategp2x_ind12++)
  { Controller.inst().migrategp2((PatientGP) patientgpmigrategp2x.get(patientgpmigrategp2x_ind12)); }


  }



    public void task3() 
  { 

       List patientgptask31x = new Vector();
  patientgptask31x.addAll(Controller.inst().patientgps);
  for (int patientgptask31x_ind13 = 0; patientgptask31x_ind13 < patientgptask31x.size(); patientgptask31x_ind13++)
  { Controller.inst().task31((PatientGP) patientgptask31x.get(patientgptask31x_ind13)); }


  }


 
}




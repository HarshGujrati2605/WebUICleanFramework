package com.globalvariable;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import io.appium.java_client.AppiumDriver;
/**
 * 
 * @author Harsh Gujrati
 * Do not delete driver variable , this will crash the framework.
 *
 */

public class GlobalVariable {
	public static WebDriver driver ;
	public static String ManageCampaignContactPerson = "10001091";
	public static String programNameStudentLeadDetails = "Bug Test";
    public static String brandcampuslead = "bed";
    public static String brandcampusleadregression2 = "DXTXCXllXgXXXfXNXrsXng-Dehradun";
    public static String campaignName;
    public static String enquiryID;
    public static String GradeOrProgramName ;
    public static String GradeorProgramBatchName ;
    public static String ApplcFeePlanName ;
    public static String ExamRevaluationName;
    public static String prgOrGradeNameIntakeDetails;
    public static String prgOrGradePeriodName;
    public static String periodStatus ="Regular";
    public static String classNames;
   // public static String Subname;
    public static String selectionProcess ;
    public static String Dayfordatepicker = "20";
    public static String ApplicantFirstName ;
    public static String assignCalendar;
    public static String academyLocation ;
    public static String ApplicationId ;
    public static String programgrp ;
    public static String seatType ;
    public static String stagename1  ;
    public static String stagename2 ;
    public static String ApplFeeplanDescp1 ;
    public static String ApplFeeplanDescp2 ;
    public static  String ProgramFeePlanName ;
    public static String PrgFeeplanDescp1 ;
    public static String PrgFeeplanDescp2 ;
    public static String ProFeeplanSelectionstage;
    public static String StudentId;
    public static String PrgFeeplanDescp3 ;
    public static String PrgFeeplanDescp4 ;
    public static String CoursesubjectName ;
    public static String CoursesubjectCode;
    public static String ReceiptId;
    public static String PBSSectionName;
    public static String enquiryName;
    public static String studentEnquiryName; 
    public static String schoolMasterName;
	public static String studentName ;
	public static String AssessmentSchemeName ;
	public static String AssessmentType ="Auto Assessment Type";
	public static String AssessmentSubType ="Assessment SubType";
	public static String AssessmentMethodtName;
	public static String AssessmentEvent;
	public static String AssmntSchemeRuleName;
	public static String AssmntTypeRuleName;
	public static String AssmntSubTypeRuleName;
	public static String AssmntMethodRuleName;
	public static String reevalutionName ;
	public static String academicTerm ="2023" ;
	public static String PBSSectionNameSIS;
	public static List<String> courseslist = new ArrayList<>();
    }


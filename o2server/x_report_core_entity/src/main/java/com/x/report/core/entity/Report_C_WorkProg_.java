/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.report.core.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.report.core.entity.Report_C_WorkProg.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Fri Dec 21 15:31:57 CST 2018")
public class Report_C_WorkProg_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<Report_C_WorkProg,Boolean> completed;
    public static volatile SingularAttribute<Report_C_WorkProg,Date> date;
    public static volatile SingularAttribute<Report_C_WorkProg,String> flag;
    public static volatile SingularAttribute<Report_C_WorkProg,String> id;
    public static volatile SingularAttribute<Report_C_WorkProg,String> keyWorkId;
    public static volatile SingularAttribute<Report_C_WorkProg,String> measuresId;
    public static volatile SingularAttribute<Report_C_WorkProg,String> measuresTitle;
    public static volatile SingularAttribute<Report_C_WorkProg,String> month;
    public static volatile SingularAttribute<Report_C_WorkProg,Integer> orderNumber;
    public static volatile SingularAttribute<Report_C_WorkProg,String> planId;
    public static volatile SingularAttribute<Report_C_WorkProg,String> profileId;
    public static volatile SingularAttribute<Report_C_WorkProg,String> reportId;
    public static volatile SingularAttribute<Report_C_WorkProg,String> targetIdentity;
    public static volatile SingularAttribute<Report_C_WorkProg,String> targetPerson;
    public static volatile SingularAttribute<Report_C_WorkProg,String> title;
    public static volatile SingularAttribute<Report_C_WorkProg,String> week;
    public static volatile SingularAttribute<Report_C_WorkProg,String> workInfoId;
    public static volatile SingularAttribute<Report_C_WorkProg,String> workTitle;
    public static volatile SingularAttribute<Report_C_WorkProg,String> year;
}
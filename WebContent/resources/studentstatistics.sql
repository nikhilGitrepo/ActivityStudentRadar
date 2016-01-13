show databases;

create database ActivityRadarDatabase;

use ActivityRadarDatabase;

show tables;

CREATE TABLE `studentstatistics` (
  `PASS_PROBABILITY` double DEFAULT NULL,
  `AGE` int(11) DEFAULT 0,
  `RMN_SCORE_PARTIAL` double DEFAULT NULL,
  `ALTERNATIVE_ID` varchar(200),
  `SAT_VERBAL` int(11) DEFAULT 0,
  `PERCENTILE` varchar(200),
  `COURSE_ID` varchar(200),
  `R_ASSMT_SUB` varchar(200),
  `STANDING` int(11) DEFAULT 0,
  `R_ASSMT_TAKE` varchar(200),
  `RC_GENDER` int(11) DEFAULT 0,
  `ONLINE_FLAG` int(11) DEFAULT 0,
  `ACADEMIC_RISK` int(11) DEFAULT 0,
  `R_FORUM_POST` double DEFAULT NULL,
  `APTITUDE_SCORE` int(11) DEFAULT 0,
  `MODEL_RISK_CONFIDENCE` varchar(200),
  `R_SESSIONS` double DEFAULT NULL,
  `RMN_SCORE` double DEFAULT NULL,
  `RC_ENROLLMENT_STATUS` int(11) DEFAULT 0,
  `RC_CLASS_CODE` int(11) DEFAULT 0,
  `RC_FINAL_GRADE` double DEFAULT NULL,
  `R_ASN_SUB` double DEFAULT NULL,
  `R_FORUM_READ` varchar(200),
  `FAIL_PROBABILITY` double DEFAULT NULL,
  `GPA_CUMULATIVE` double DEFAULT NULL,
  `R_LESSONS_VIEW` double DEFAULT NULL,
  `ENROLLMENT` int(11) DEFAULT 0,
  `R_CONTENT_READ` double DEFAULT NULL,
  `SAT_MATH` int(11) DEFAULT 0,
  `GPA_SEMESTER` double DEFAULT NULL,
  `R_ASN_READ` varchar(200),
  `SUBJECT` varchar(200)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

select * from studentstatistics;

truncate studentstatistics;

INSERT INTO `activityradardatabase`.`studentstatistics` (`ALTERNATIVE_ID`,`COURSE_ID`,`SUBJECT`,`ONLINE_FLAG`,`ENROLLMENT`,`RC_FINAL_GRADE`,`PERCENTILE`,`SAT_VERBAL`,`SAT_MATH`,`APTITUDE_SCORE`,`AGE`,`RC_GENDER`,`RC_ENROLLMENT_STATUS`,`RC_CLASS_CODE`,`GPA_CUMULATIVE`,`GPA_SEMESTER`,`STANDING`,`RMN_SCORE`,`RMN_SCORE_PARTIAL`,`R_CONTENT_READ`,`R_ASSMT_SUB`,`R_FORUM_POST`,`R_FORUM_READ`,`R_LESSONS_VIEW`,`R_ASSMT_TAKE`,`R_ASN_SUB`,`R_ASN_READ`,`R_SESSIONS`,`ACADEMIC_RISK`,`FAIL_PROBABILITY`,`PASS_PROBABILITY`,`MODEL_RISK_CONFIDENCE`)VALUES ('STUDENT12','MNG_333N_222_08F','Management',1,29,4,74,460,480,940,22,2,1,5,4,3.72,2,97.9625,97.9625,1.5,null,0.5,null,2.6,null,1,null,2.948312,1,0.054521,0.945479,'NO RISK');
INSERT INTO `activityradardatabase`.`studentstatistics` (`ALTERNATIVE_ID`,`COURSE_ID`,`SUBJECT`,`ONLINE_FLAG`,`ENROLLMENT`,`RC_FINAL_GRADE`,`PERCENTILE`,`SAT_VERBAL`,`SAT_MATH`,`APTITUDE_SCORE`,`AGE`,`RC_GENDER`,`RC_ENROLLMENT_STATUS`,`RC_CLASS_CODE`,`GPA_CUMULATIVE`,`GPA_SEMESTER`,`STANDING`,`RMN_SCORE`,`RMN_SCORE_PARTIAL`,`R_CONTENT_READ`,`R_ASSMT_SUB`,`R_FORUM_POST`,`R_FORUM_READ`,`R_LESSONS_VIEW`,`R_ASSMT_TAKE`,`R_ASN_SUB`,`R_ASN_READ`,`R_SESSIONS`,`ACADEMIC_RISK`,`FAIL_PROBABILITY`,`PASS_PROBABILITY`,`MODEL_RISK_CONFIDENCE`)VALUES ('STUDENT13','MNG_333N_222_08F','Management',1,29,3.7,94,620,660,1280,22,2,1,5,3.8729,3.68,2,25,101.276,1.71056,null,2.5,null,2.4,null,2.4,null,2.00949,3,0.026938,0.973062,'NO RISK');
INSERT INTO `activityradardatabase`.`studentstatistics` (`ALTERNATIVE_ID`,`COURSE_ID`,`SUBJECT`,`ONLINE_FLAG`,`ENROLLMENT`,`RC_FINAL_GRADE`,`PERCENTILE`,`SAT_VERBAL`,`SAT_MATH`,`APTITUDE_SCORE`,`AGE`,`RC_GENDER`,`RC_ENROLLMENT_STATUS`,`RC_CLASS_CODE`,`GPA_CUMULATIVE`,`GPA_SEMESTER`,`STANDING`,`RMN_SCORE`,`RMN_SCORE_PARTIAL`,`R_CONTENT_READ`,`R_ASSMT_SUB`,`R_FORUM_POST`,`R_FORUM_READ`,`R_LESSONS_VIEW`,`R_ASSMT_TAKE`,`R_ASN_SUB`,`R_ASN_READ`,`R_SESSIONS`,`ACADEMIC_RISK`,`FAIL_PROBABILITY`,`PASS_PROBABILITY`,`MODEL_RISK_CONFIDENCE`)VALUES ('STUDENT16','MNG_333N_222_08F','Management',1,29,3.7,null,450,480,950,22,2,1,4,2.43,3.2,1,70.777,101.777,1.55144,null,2,null,1.7,null,1.7,null,1.978903,3,0.321891,0.678109,'LOW RISK');
INSERT INTO `activityradardatabase`.`studentstatistics` (`ALTERNATIVE_ID`,`COURSE_ID`,`SUBJECT`,`ONLINE_FLAG`,`ENROLLMENT`,`RC_FINAL_GRADE`,`PERCENTILE`,`SAT_VERBAL`,`SAT_MATH`,`APTITUDE_SCORE`,`AGE`,`RC_GENDER`,`RC_ENROLLMENT_STATUS`,`RC_CLASS_CODE`,`GPA_CUMULATIVE`,`GPA_SEMESTER`,`STANDING`,`RMN_SCORE`,`RMN_SCORE_PARTIAL`,`R_CONTENT_READ`,`R_ASSMT_SUB`,`R_FORUM_POST`,`R_FORUM_READ`,`R_LESSONS_VIEW`,`R_ASSMT_TAKE`,`R_ASN_SUB`,`R_ASN_READ`,`R_SESSIONS`,`ACADEMIC_RISK`,`FAIL_PROBABILITY`,`PASS_PROBABILITY`,`MODEL_RISK_CONFIDENCE`)VALUES ('STUDENT17','MNG_333N_222_08F','Management',1,29,3.3,null,560,630,1190,21,2,1,5,2.625,3.4,1,78.3499,97.3499,1.339781,null,1.7,null,1.9,null,1.9,null,1.72838,2,0.37544,0.62456,'LOW RISK');
INSERT INTO `activityradardatabase`.`studentstatistics` (`ALTERNATIVE_ID`,`COURSE_ID`,`SUBJECT`,`ONLINE_FLAG`,`ENROLLMENT`,`RC_FINAL_GRADE`,`PERCENTILE`,`SAT_VERBAL`,`SAT_MATH`,`APTITUDE_SCORE`,`AGE`,`RC_GENDER`,`RC_ENROLLMENT_STATUS`,`RC_CLASS_CODE`,`GPA_CUMULATIVE`,`GPA_SEMESTER`,`STANDING`,`RMN_SCORE`,`RMN_SCORE_PARTIAL`,`R_CONTENT_READ`,`R_ASSMT_SUB`,`R_FORUM_POST`,`R_FORUM_READ`,`R_LESSONS_VIEW`,`R_ASSMT_TAKE`,`R_ASN_SUB`,`R_ASN_READ`,`R_SESSIONS`,`ACADEMIC_RISK`,`FAIL_PROBABILITY`,`PASS_PROBABILITY`,`MODEL_RISK_CONFIDENCE`)VALUES ('STUDENT18','MNG_333N_222_08F','Management',1,29,3.7,85,540,550,1090,21,2,1,5,2.6867,2.96,1,64.3896,94.3896,1.47188,null,1.2,null,1.7,null,1.7,null,1.380063,2,0.487841,0.512159,'MEDIUM RISK');
INSERT INTO `activityradardatabase`.`studentstatistics` (`ALTERNATIVE_ID`,`COURSE_ID`,`SUBJECT`,`ONLINE_FLAG`,`ENROLLMENT`,`RC_FINAL_GRADE`,`PERCENTILE`,`SAT_VERBAL`,`SAT_MATH`,`APTITUDE_SCORE`,`AGE`,`RC_GENDER`,`RC_ENROLLMENT_STATUS`,`RC_CLASS_CODE`,`GPA_CUMULATIVE`,`GPA_SEMESTER`,`STANDING`,`RMN_SCORE`,`RMN_SCORE_PARTIAL`,`R_CONTENT_READ`,`R_ASSMT_SUB`,`R_FORUM_POST`,`R_FORUM_READ`,`R_LESSONS_VIEW`,`R_ASSMT_TAKE`,`R_ASN_SUB`,`R_ASN_READ`,`R_SESSIONS`,`ACADEMIC_RISK`,`FAIL_PROBABILITY`,`PASS_PROBABILITY`,`MODEL_RISK_CONFIDENCE`)VALUES ('STUDENT19','MNG_333N_222_08F','Management',1,29,3.7,null,510,560,1070,20,1,1,5,2.6214,3.925,2,64.868,104.868,1.8299,null,1.7,null,1.4,null,1.4,null,1.66719,2,0.17039,0.982961,'MEDIUM RISK');
INSERT INTO `activityradardatabase`.`studentstatistics` (`ALTERNATIVE_ID`,`COURSE_ID`,`SUBJECT`,`ONLINE_FLAG`,`ENROLLMENT`,`RC_FINAL_GRADE`,`PERCENTILE`,`SAT_VERBAL`,`SAT_MATH`,`APTITUDE_SCORE`,`AGE`,`RC_GENDER`,`RC_ENROLLMENT_STATUS`,`RC_CLASS_CODE`,`GPA_CUMULATIVE`,`GPA_SEMESTER`,`STANDING`,`RMN_SCORE`,`RMN_SCORE_PARTIAL`,`R_CONTENT_READ`,`R_ASSMT_SUB`,`R_FORUM_POST`,`R_FORUM_READ`,`R_LESSONS_VIEW`,`R_ASSMT_TAKE`,`R_ASN_SUB`,`R_ASN_READ`,`R_SESSIONS`,`ACADEMIC_RISK`,`FAIL_PROBABILITY`,`PASS_PROBABILITY`,`MODEL_RISK_CONFIDENCE`)VALUES ('STUDENT2','MNG_333N_222_08F','Management',1,29,1.3,null,600,650,1190,22,2,1,4,2.5182,2.66,1,64.4106,96.4106,1.75583,null,1.3,null,1.5,null,1.5,null,1.19304,2,0.722519,0.277481,'MEDIUM RISK');
INSERT INTO `activityradardatabase`.`studentstatistics` (`ALTERNATIVE_ID`,`COURSE_ID`,`SUBJECT`,`ONLINE_FLAG`,`ENROLLMENT`,`RC_FINAL_GRADE`,`PERCENTILE`,`SAT_VERBAL`,`SAT_MATH`,`APTITUDE_SCORE`,`AGE`,`RC_GENDER`,`RC_ENROLLMENT_STATUS`,`RC_CLASS_CODE`,`GPA_CUMULATIVE`,`GPA_SEMESTER`,`STANDING`,`RMN_SCORE`,`RMN_SCORE_PARTIAL`,`R_CONTENT_READ`,`R_ASSMT_SUB`,`R_FORUM_POST`,`R_FORUM_READ`,`R_LESSONS_VIEW`,`R_ASSMT_TAKE`,`R_ASN_SUB`,`R_ASN_READ`,`R_SESSIONS`,`ACADEMIC_RISK`,`FAIL_PROBABILITY`,`PASS_PROBABILITY`,`MODEL_RISK_CONFIDENCE`)VALUES ('STUDENT20','MNG_333N_222_08F','Management',1,29,4,null,580,570,1150,20,1,1,3,2.5184,3.94,2,60.868,103.868,0.914952,null,1.8,null,1.5,null,1.5,null,1.04008,4,0.036194,0.963806,'MEDIUM RISK');
INSERT INTO `activityradardatabase`.`studentstatistics` (`ALTERNATIVE_ID`,`COURSE_ID`,`SUBJECT`,`ONLINE_FLAG`,`ENROLLMENT`,`RC_FINAL_GRADE`,`PERCENTILE`,`SAT_VERBAL`,`SAT_MATH`,`APTITUDE_SCORE`,`AGE`,`RC_GENDER`,`RC_ENROLLMENT_STATUS`,`RC_CLASS_CODE`,`GPA_CUMULATIVE`,`GPA_SEMESTER`,`STANDING`,`RMN_SCORE`,`RMN_SCORE_PARTIAL`,`R_CONTENT_READ`,`R_ASSMT_SUB`,`R_FORUM_POST`,`R_FORUM_READ`,`R_LESSONS_VIEW`,`R_ASSMT_TAKE`,`R_ASN_SUB`,`R_ASN_READ`,`R_SESSIONS`,`ACADEMIC_RISK`,`FAIL_PROBABILITY`,`PASS_PROBABILITY`,`MODEL_RISK_CONFIDENCE`)VALUES ('STUDENT23','MNG_333N_222_08F','Management',1,29,2.7,null,590,530,1120,21,1,1,2,1.6025,2.86,1,50.32,105.32,0.954732,null,0.8,null,0.6,null,0.6,null,0.7577,5,0.326441,0.673559,'HIGH RISK');
INSERT INTO `activityradardatabase`.`studentstatistics` (`ALTERNATIVE_ID`,`COURSE_ID`,`SUBJECT`,`ONLINE_FLAG`,`ENROLLMENT`,`RC_FINAL_GRADE`,`PERCENTILE`,`SAT_VERBAL`,`SAT_MATH`,`APTITUDE_SCORE`,`AGE`,`RC_GENDER`,`RC_ENROLLMENT_STATUS`,`RC_CLASS_CODE`,`GPA_CUMULATIVE`,`GPA_SEMESTER`,`STANDING`,`RMN_SCORE`,`RMN_SCORE_PARTIAL`,`R_CONTENT_READ`,`R_ASSMT_SUB`,`R_FORUM_POST`,`R_FORUM_READ`,`R_LESSONS_VIEW`,`R_ASSMT_TAKE`,`R_ASN_SUB`,`R_ASN_READ`,`R_SESSIONS`,`ACADEMIC_RISK`,`FAIL_PROBABILITY`,`PASS_PROBABILITY`,`MODEL_RISK_CONFIDENCE`)VALUES ('STUDENT27','MNG_333N_222_08F','Management',1,29,3,null,600,560,1160,21,1,1,3,3.2141,2.72,1,98.944,98.944,2.02881,null,2.1,null,2.8,null,2.8,null,0.703587,2,0.421987,0.578013,'NO RISK');
INSERT INTO `activityradardatabase`.`studentstatistics` (`ALTERNATIVE_ID`,`COURSE_ID`,`SUBJECT`,`ONLINE_FLAG`,`ENROLLMENT`,`RC_FINAL_GRADE`,`PERCENTILE`,`SAT_VERBAL`,`SAT_MATH`,`APTITUDE_SCORE`,`AGE`,`RC_GENDER`,`RC_ENROLLMENT_STATUS`,`RC_CLASS_CODE`,`GPA_CUMULATIVE`,`GPA_SEMESTER`,`STANDING`,`RMN_SCORE`,`RMN_SCORE_PARTIAL`,`R_CONTENT_READ`,`R_ASSMT_SUB`,`R_FORUM_POST`,`R_FORUM_READ`,`R_LESSONS_VIEW`,`R_ASSMT_TAKE`,`R_ASN_SUB`,`R_ASN_READ`,`R_SESSIONS`,`ACADEMIC_RISK`,`FAIL_PROBABILITY`,`PASS_PROBABILITY`,`MODEL_RISK_CONFIDENCE`)VALUES ('STUDENT28','MNG_333N_222_08F','Management',1,29,1,null,null,null,null,36,1,2,4,2.335,1.7667,0,62.5423,62.5423,0.238683,null,0.4,null,0.7,null,0.7,null,0.152954,4,0.985998,0.014002,'HIGH RISK');
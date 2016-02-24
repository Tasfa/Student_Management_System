create database study;
use study;
CREATE TABLE course(cno char(2),cname char(16),credit decimal(2,1));
insert into course values("c1","数据库",4);
insert into course values("c2","数学",2.5);
insert into course values("c3","信息系统",4);
insert into course values("c4","英语",3);
CREATE TABLE student(sno char(5),sname char(10),ssex char(2),sage int,sdept char(20));
insert into student values("20001","李薇","女",20,"信息安全系");
insert into student values("20002","叶琳","女",20,"信息安全系");
insert into student values("20003","张武","男",21,"信息安全系");
insert into student values("20004","王民","男",20,"信息安全系");
CREATE TABLE SC(Sno char(5),Cno char(2),Grade decimal(3,0));
insert into SC values("20001","c1",91);
insert into SC values("20001","c2",92);
insert into SC values("20001","c3",93);
insert into SC values("20001","c4",94);
insert into SC values("20002","c2",81);
insert into SC values("20002","c3",80);
insert into SC values("20004","c1",70);
insert into SC values("20004","c2",71);
insert into SC values("20004","c3",72);




















insert into student values("20005","黄伟","男",21,"信息安全系");
insert into student values("20006","蒋孝琳","女",21,"信息安全系");
insert into student values("20007","苏白","男",21,"信息安全系");
insert into student values("20008","林思雅","女",19,"信息安全系");
insert into student values("20009","王芳","女",20,"信息安全系");
insert into student values("20010","赵天奇","男",20,"信息安全系");
insert into student values("20011","林芳雅","女",21,"信息安全系");
insert into student values("20012","李绍","男",20,"信息安全系");
insert into student values("20013","叶一菲","女",20,"信息安全系");
insert into student values("20014","张幼林","男",19,"信息安全系");
insert into student values("20015","黄有民","男",20,"信息安全系");
insert into student values("20016","关芝雅","女",20,"信息安全系");
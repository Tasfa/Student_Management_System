create database study;
use study;
CREATE TABLE course(cno char(2),cname char(16),credit decimal(2,1));
insert into course values("c1","���ݿ�",4);
insert into course values("c2","��ѧ",2.5);
insert into course values("c3","��Ϣϵͳ",4);
insert into course values("c4","Ӣ��",3);
CREATE TABLE student(sno char(5),sname char(10),ssex char(2),sage int,sdept char(20));
insert into student values("20001","��ޱ","Ů",20,"��Ϣ��ȫϵ");
insert into student values("20002","Ҷ��","Ů",20,"��Ϣ��ȫϵ");
insert into student values("20003","����","��",21,"��Ϣ��ȫϵ");
insert into student values("20004","����","��",20,"��Ϣ��ȫϵ");
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




















insert into student values("20005","��ΰ","��",21,"��Ϣ��ȫϵ");
insert into student values("20006","��Т��","Ů",21,"��Ϣ��ȫϵ");
insert into student values("20007","�հ�","��",21,"��Ϣ��ȫϵ");
insert into student values("20008","��˼��","Ů",19,"��Ϣ��ȫϵ");
insert into student values("20009","����","Ů",20,"��Ϣ��ȫϵ");
insert into student values("20010","������","��",20,"��Ϣ��ȫϵ");
insert into student values("20011","�ַ���","Ů",21,"��Ϣ��ȫϵ");
insert into student values("20012","����","��",20,"��Ϣ��ȫϵ");
insert into student values("20013","Ҷһ��","Ů",20,"��Ϣ��ȫϵ");
insert into student values("20014","������","��",19,"��Ϣ��ȫϵ");
insert into student values("20015","������","��",20,"��Ϣ��ȫϵ");
insert into student values("20016","��֥��","Ů",20,"��Ϣ��ȫϵ");
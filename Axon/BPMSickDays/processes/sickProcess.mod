[Ivy]
17FD177C75F4B5CF 9.3.1 #module
>Proto >Proto Collection #zClass
ss0 sickProcess Big #zClass
ss0 B #cInfo
ss0 #process
ss0 @AnnotationInP-0n ai ai #zField
ss0 @TextInP .type .type #zField
ss0 @TextInP .processKind .processKind #zField
ss0 @TextInP .xml .xml #zField
ss0 @TextInP .responsibility .responsibility #zField
ss0 @StartRequest f0 '' #zField
ss0 @EndTask f1 '' #zField
ss0 @UserDialog f3 '' #zField
ss0 @PushWFArc f4 '' #zField
ss0 @Split f2 '' #zField
ss0 @PushWFArc f6 '' #zField
ss0 @PushWFArc f7 '' #zField
ss0 @DBStep f5 '' #zField
ss0 @PushWFArc f8 '' #zField
>Proto ss0 ss0 sickProcess #zField
ss0 f0 outLink start.ivp #txt
ss0 f0 inParamDecl '<> param;' #txt
ss0 f0 requestEnabled true #txt
ss0 f0 triggerEnabled false #txt
ss0 f0 callSignature start() #txt
ss0 f0 caseData businessCase.attach=true #txt
ss0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start.ivp</name>
    </language>
</elementInfo>
' #txt
ss0 f0 @C|.responsibility Everybody #txt
ss0 f0 81 49 30 30 -21 17 #rect
ss0 f1 841 49 30 30 0 15 #rect
ss0 f3 dialogId bpms.enterSickDays #txt
ss0 f3 startMethod start(bpms.FormData) #txt
ss0 f3 requestActionDecl '<bpms.FormData data> param;' #txt
ss0 f3 requestMappingAction 'param.data=in;
' #txt
ss0 f3 responseMappingAction 'out=result.data;
' #txt
ss0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>Enter Sick Request</name>
    </language>
</elementInfo>
' #txt
ss0 f3 272 42 112 44 -52 -8 #rect
ss0 f4 111 64 272 64 #arcP
ss0 f2 actionTable 'out1=in;
' #txt
ss0 f2 592 48 32 32 0 16 #rect
ss0 f6 384 64 592 64 #arcP
ss0 f7 expr out1 #txt
ss0 f7 624 64 841 64 #arcP
ss0 f5 actionTable 'out=in;
' #txt
ss0 f5 dbSql '<?xml version=""1.0"" standalone=""no""?>
<!DOCTYPE INSERT SYSTEM  ""sqlStatements.dtd"">
<INSERT><Table name=''forms_tab''/><Value column=''user_name''><AnyExpression>in.getName()</AnyExpression></Value><Value column=''start_dt''><AnyExpression>in.getStartDate()</AnyExpression></Value><Value column=''end_dt''><AnyExpression>in.endDate</AnyExpression></Value><Value column=''text_comment''><AnyExpression>in.getComment()</AnyExpression></Value><Value column=''form_status''><String>""Pending""</String></Value></INSERT>' #txt
ss0 f5 dbUrl users #txt
ss0 f5 lotSize 2147483647 #txt
ss0 f5 startIdx 0 #txt
ss0 f5 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>insert form</name>
    </language>
</elementInfo>
' #txt
ss0 f5 552 202 112 44 -29 -8 #rect
ss0 f8 expr out2 #txt
ss0 f8 608 80 608 202 #arcP
>Proto ss0 .type bpms.FormData #txt
>Proto ss0 .processKind NORMAL #txt
>Proto ss0 0 0 32 24 18 0 #rect
>Proto ss0 @|BIcon #fIcon
ss0 f0 mainOut f4 tail #connect
ss0 f4 head f3 mainIn #connect
ss0 f3 mainOut f6 tail #connect
ss0 f6 head f2 in #connect
ss0 f2 out f7 tail #connect
ss0 f7 head f1 mainIn #connect
ss0 f2 out f8 tail #connect
ss0 f8 head f5 mainIn #connect

[Ivy]
17FD17A13ABB2EC0 9.3.1 #module
>Proto >Proto Collection #zClass
es0 enterSickDaysProcess Big #zClass
es0 RD #cInfo
es0 #process
es0 @AnnotationInP-0n ai ai #zField
es0 @TextInP .type .type #zField
es0 @TextInP .processKind .processKind #zField
es0 @TextInP .xml .xml #zField
es0 @TextInP .responsibility .responsibility #zField
es0 @UdInit f0 '' #zField
es0 @UdProcessEnd f1 '' #zField
es0 @UdEvent f3 '' #zField
es0 @UdExitEnd f4 '' #zField
es0 @PushWFArc f2 '' #zField
es0 @PushWFArc f5 '' #zField
>Proto es0 es0 enterSickDaysProcess #zField
es0 f0 guid 17FD17A13B1F82A2 #txt
es0 f0 method start(bpms.FormData) #txt
es0 f0 inParameterDecl '<bpms.FormData data> param;' #txt
es0 f0 inParameterMapAction 'out.data=param.data;
' #txt
es0 f0 outParameterDecl '<bpms.FormData data> result;' #txt
es0 f0 outParameterMapAction 'result.data=in.data;
' #txt
es0 f0 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>start(Data)</name>
    </language>
</elementInfo>
' #txt
es0 f0 83 51 26 26 -29 15 #rect
es0 f1 475 51 26 26 0 12 #rect
es0 f3 guid 17FD17A13BB2BBF4 #txt
es0 f3 actionTable 'out=in;
' #txt
es0 f3 @C|.xml '<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<elementInfo>
    <language>
        <name>close</name>
    </language>
</elementInfo>
' #txt
es0 f3 83 235 26 26 -15 15 #rect
es0 f4 475 235 26 26 0 12 #rect
es0 f2 109 64 475 64 #arcP
es0 f5 109 248 475 248 #arcP
>Proto es0 .type bpms.enterSickDays.enterSickDaysData #txt
>Proto es0 .processKind HTML_DIALOG #txt
>Proto es0 -8 -8 16 16 16 26 #rect
es0 f0 mainOut f2 tail #connect
es0 f2 head f1 mainIn #connect
es0 f3 mainOut f5 tail #connect
es0 f5 head f4 mainIn #connect

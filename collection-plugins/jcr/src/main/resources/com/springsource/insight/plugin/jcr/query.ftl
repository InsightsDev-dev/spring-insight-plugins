<#ftl strip_whitespace=true>
<#import "/insight-1.0.ftl" as insight />

<@insight.group label="Details">
    <@insight.entry name="Statement" value=operation.statement/>
</@insight.group>    

<@insight.sourceCodeLocation location=operation.sourceCodeLocation />

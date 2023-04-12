<?xml version="1.0" encoding="utf-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
        <table cellpading="2" cellspacing="2" border="1">
            <tr>
                <th>type</th>
                <th>seats</th>
                <th>ammunition</th>
                <xsl:apply-templates select="planes"/>
            </tr>
        </table>
    </xsl:template>

    <xsl:template match="planes">
        <xsl:apply-templates select="plane"/>
    </xsl:template>

    <xsl:template match="plane">
        <tr>
            <td>
                <xsl:value-of select="type"/>
            </td>
            <td>
                <xsl:value-of select="seats"/>
            </td>
            <td>
                <xsl:value-of select="ammunition"/>
            </td>
        </tr>
    </xsl:template>
</xsl:stylesheet>
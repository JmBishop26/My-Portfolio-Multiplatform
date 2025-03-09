@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package myportfolioapp.composeapp.generated.resources

import org.jetbrains.compose.resources.FontResource

private object CommonMainFont0 {
    public val font_poppins_bold: FontResource by
    lazy { init_font_poppins_bold() }

    public val font_poppins_medium: FontResource by
    lazy { init_font_poppins_medium() }

    public val font_poppins_regular: FontResource by
    lazy { init_font_poppins_regular() }
}

internal val Res.font.font_poppins_bold: FontResource
    get() = CommonMainFont0.font_poppins_bold

private fun init_font_poppins_bold(): FontResource = org.jetbrains.compose.resources.FontResource(
    "font:font_poppins_bold",
    setOf(
        org.jetbrains.compose.resources.ResourceItem(
            setOf(),
            "composeResources/myportfolioapp.composeapp.generated.resources/font/font_poppins_bold.ttf",
            -1,
            -1
        ),
    )
)

internal val Res.font.font_poppins_medium: FontResource
    get() = CommonMainFont0.font_poppins_medium

private fun init_font_poppins_medium(): FontResource = org.jetbrains.compose.resources.FontResource(
    "font:font_poppins_medium",
    setOf(
        org.jetbrains.compose.resources.ResourceItem(
            setOf(),
            "composeResources/myportfolioapp.composeapp.generated.resources/font/font_poppins_medium.ttf",
            -1,
            -1
        ),
    )
)

internal val Res.font.font_poppins_regular: FontResource
    get() = CommonMainFont0.font_poppins_regular

private fun init_font_poppins_regular(): FontResource =
    org.jetbrains.compose.resources.FontResource(
        "font:font_poppins_regular",
        setOf(
            org.jetbrains.compose.resources.ResourceItem(
                setOf(),
                "composeResources/myportfolioapp.composeapp.generated.resources/font/font_poppins_regular.ttf",
                -1,
                -1
            ),
        )
    )

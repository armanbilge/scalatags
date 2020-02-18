//package scalatags
//package vdom
//
//import scalatags.generic.{Namespace, Util}
//
//trait SvgTags[FragT, Output <: FragT]
//extends generic.SvgTags[Builder[Output, FragT], Output, FragT] with TagFactory[Output, FragT]{
//  implicit lazy val svgNamespaceConfig = Namespace.svgNamespaceConfig
//  lazy val altGlyph = tag("altGlyph")
//  lazy val altGlyphDef = tag("altGlyphDef")
//  lazy val altGlyphItem = tag("altGlyphItem")
//  lazy val animate = tag("animate")
//  lazy val animateMotion = tag("animateMotion")
//  lazy val animateTransform = tag("animateTransform")
//  lazy val circle = tag("circle")
//  lazy val clipPath = tag("clipPath")
//  lazy val `color-profile` = tag("color-profile")
//  lazy val cursor = tag("cursor")
//  lazy val defs = tag("defs")
//  lazy val desc = tag("desc")
//  lazy val ellipse = tag("ellipse")
//  lazy val feBlend = tag("feBlend")
//  lazy val feColorMatrix = tag("feColorMatrix")
//  lazy val feComponentTransfer = tag("feComponentTransfer")
//  lazy val feComposite = tag("feComposite")
//  lazy val feConvolveMatrix = tag("feConvolveMatrix")
//  lazy val feDiffuseLighting = tag("feDiffuseLighting")
//  lazy val feDisplacementMap = tag("feDisplacementMap")
//  lazy val feDistantLighting = tag("feDistantLighting")
//  lazy val feFlood = tag("feFlood")
//  lazy val feFuncA = tag("feFuncA")
//  lazy val feFuncB = tag("feFuncB")
//  lazy val feFuncG = tag("feFuncG")
//  lazy val feFuncR = tag("feFuncR")
//  lazy val feGaussianBlur = tag("feGaussianBlur")
//  lazy val feImage = tag("feImage")
//  lazy val feMerge = tag("feMerge")
//  lazy val feMergeNode = tag("feMergeNode")
//  lazy val feMorphology = tag("feMorphology")
//  lazy val feOffset = tag("feOffset")
//  lazy val fePointLight = tag("fePointLight")
//  lazy val feSpecularLighting = tag("feSpecularLighting")
//  lazy val feSpotlight = tag("feSpotlight")
//  lazy val feTile = tag("feTile")
//  lazy val feTurbulance = tag("feTurbulance")
//  lazy val filter = tag("filter")
//  lazy val font = tag("font")
//  lazy val `font-face` = tag("font-face")
//  lazy val `font-face-format` = tag("font-face-format")
//  lazy val `font-face-name` = tag("font-face-name")
//  lazy val `font-face-src` = tag("font-face-src")
//  lazy val `font-face-uri` = tag("font-face-uri")
//  lazy val foreignObject = tag("foreignObject")
//  lazy val g = tag("g")
//  lazy val glyph = tag("glyph")
//  lazy val glyphRef = tag("glyphRef")
//  lazy val hkern = tag("hkern")
//  lazy val image = tag("image")
//  lazy val line = tag("line")
//  lazy val linearGradient = tag("linearGradient")
//  lazy val marker = tag("marker")
//  lazy val mask = tag("mask")
//  lazy val metadata = tag("metadata")
//  lazy val `missing-glyph` = tag("missing-glyph")
//  lazy val mpath = tag("mpath")
//  lazy val path = tag("path")
//  lazy val pattern = tag("pattern")
//  lazy val polygon = tag("polygon")
//  lazy val polyline = tag("polyline")
//  lazy val radialGradient = tag("radialGradient")
//  lazy val rect = tag("rect")
//  lazy val set = tag("set")
//  lazy val stop = tag("stop")
//  lazy val svg = tag("svg")
//  lazy val switch = tag("switch")
//  lazy val symbol = tag("symbol")
//  lazy val text = tag("text")
//  lazy val textPath = tag("textPath")
//  lazy val tref = tag("tref")
//  lazy val tspan = tag("tspan")
//  lazy val use = tag("use")
//  lazy val view = tag("view")
//  lazy val vkern = tag("vkern")
//}

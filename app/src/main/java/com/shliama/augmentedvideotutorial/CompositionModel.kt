package com.shliama.augmentedvideotutorial

data class CompositionModel(
    val originUrl: String,
    val originInfo: String,
    val videoUrl: String,
    val nextModel: CompositionModel?,
)

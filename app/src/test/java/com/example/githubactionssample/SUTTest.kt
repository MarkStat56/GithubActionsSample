package com.example.githubactionssample

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class SUTTest {

    @Nested
    @DisplayName("Given existing product id")
    inner class ExistingProductId {

        @Test
        @DisplayName("Then with deleteFromFavorites==false product is deleted but not from favorites")
        fun verifyDeletedProduct() {
            val sut = SUT("lala")
            assertThat(sut.foo()).contains("lala")
        }

        @Test
        @DisplayName("Then with deleteFromFavorites==true product is deleted including favorites")
        fun verifyDeletedProductWithFavorites() {
            val sut = SUT("lala")
            assertThat(sut.foo()).contains("lala")
        }
    }
}

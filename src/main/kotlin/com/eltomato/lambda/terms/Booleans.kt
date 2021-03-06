package com.eltomato.lambda.terms

import com.eltomato.lambda.`_`
import com.eltomato.lambda.λ

val tru3 =
    λ("a") { a ->
        λ("b") { b ->
            a
        }
    }

val fals3 =
    λ("a") { a ->
        λ("b") { b ->
            b
        }
    }

val isFals3 = λ("c") { c ->
    c _ λ("x") { x -> fals3 } _ tru3
}

val eef =
    λ("c") { c ->
        λ("t") { t ->
            λ("o") { o ->
                c _ t _ o
            }
        }
    }
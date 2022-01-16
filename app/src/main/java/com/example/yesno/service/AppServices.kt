package com.example.yesno.service

import android.graphics.drawable.Drawable
import com.example.yesno.R

class AppServices {

    fun getRandomDiceImage(): Int {
        val randomInt = (1..6).random()
        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
    }

    fun getRandomText(): String {
        val randomInt = (1..3).random()
        return when (randomInt) {
            1 -> "ДА"
            2 -> "НЕТ"
            3 -> "ВОЗМОЖНО"
            else -> "НИКОГДА"
        }
    }

    fun getRunaImage(runaInt: Int): Int {
        return when (runaInt) {
            1 -> R.drawable.anzus
            2 -> R.drawable.bercana
            3 -> R.drawable.dagas
            4 -> R.drawable.evas
            5 -> R.drawable.feu
            6 -> R.drawable.gebo
            7 -> R.drawable.hagalas
            8 -> R.drawable.ingus
            9 -> R.drawable.issa
            10 -> R.drawable.kano
            11 -> R.drawable.lagus
            12 -> R.drawable.mannas
            13 -> R.drawable.nautis
            14 -> R.drawable.otila
            15 -> R.drawable.raido
            16 -> R.drawable.turizas
            17 -> R.drawable.urus
            18 -> R.drawable.vunyo
            19 -> R.drawable.yera
            else -> R.drawable.empty_dice
        }
    }

    fun getRunaText(runaInt: Int): String {
        return when (runaInt) {
            1 -> "Скоро вы заключите выгодный договор или сдадите важный экзамен."
            2 -> "Вам необходимо сейчас больше внимания уделить семье и близким."
            3 -> "Удачное завершение дел."
            4 -> "Время двигаться вперед и не бойтесь проявлять инициативу!"
            5 -> "Умножение богатства, финансовое благополучие, успех, подъём"
            6 -> "Для одиноких – скоро в вашей жизни появится любовь, для тех у кого уже есть " +
                    "партнер – ваши отношения укрепятся. Успех в делах, " +
                    "совершенных в партнерстве с кем то."
            7 -> "Подождите еще немного и ваше ожидание вознаградится."
            8 -> "Держитесь, скоро в вашей жизни начнутся позитивные перемены!"
            9 -> "Сохранение приобретенного опыта, внутренняя сила, самоконтроль."
            10 -> "Скоро вас ждет успех!"
            11 -> "Сейчас не время для активных действий."
            12 -> "В вас есть скрытые таланты и они помогут вам."
            13 -> "Подождите еще немного и ваше ожидание вознаградится."
            14 -> "В ближайшее время достигните своей цели."
            15 -> "Циклическое развитие, рост, дорога, движение."
            16 -> "Подумайте и здраво оцените ситуацию, чтобы избежать неверного решения."
            17 -> "Большая сила, быстрые и неожиданные изменения."
            18 -> "Победа, радость, освобождение энергии, достижение поставленных целей, " +
                    "безусловная любовь, слава."
            19 -> "Постепенное развитие. Пошаговое, постепенное продвижение вперёд."
            else -> " "
        }
    }
}
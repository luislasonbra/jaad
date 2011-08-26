/*
 *  Copyright (C) 2011 in-somnia
 * 
 *  This file is part of JAAD.
 * 
 *  JAAD is free software; you can redistribute it and/or modify it 
 *  under the terms of the GNU Lesser General Public License as 
 *  published by the Free Software Foundation; either version 3 of the 
 *  License, or (at your option) any later version.
 *
 *  JAAD is distributed in the hope that it will be useful, but WITHOUT 
 *  ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 *  or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General 
 *  Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library.
 *  If not, see <http://www.gnu.org/licenses/>.
 */
package net.sourceforge.jaad.aac.ps2;

interface FilterbankTables {

	float[] FILTER_20_2 = {
		0.0f, 0.01899487526049f, 0.0f, -0.07293139167538f,
		0.0f, 0.30596630545168f, 0.5f
	};
	float[][][] FILTER_20_8 = {
		{{-0.005275603f, 0.005275603f},
			{-0.008688525f, 0.020975955f},
			{2.7841524E-18f, 0.04546866f},
			{0.027806213f, 0.06713013f},
			{0.06989827f, 0.06989827f},
			{0.108959675f, 0.045132574f},
			{0.125f, -0.0f}},
		{{0.005275603f, 0.005275603f},
			{0.020975955f, -0.008688525f},
			{-8.352457E-18f, -0.04546866f},
			{-0.06713013f, -0.027806213f},
			{-0.06989827f, 0.06989827f},
			{0.045132574f, 0.108959675f},
			{0.125f, -0.0f}},
		{{0.005275603f, -0.005275603f},
			{-0.020975955f, -0.008688525f},
			{1.3920761E-17f, 0.04546866f},
			{0.06713013f, -0.027806213f},
			{-0.06989827f, -0.06989827f},
			{-0.045132574f, 0.108959675f},
			{0.125f, -0.0f}},
		{{-0.005275603f, -0.005275603f},
			{0.008688525f, 0.020975955f},
			{-1.9489067E-17f, -0.04546866f},
			{-0.027806213f, 0.06713013f},
			{0.06989827f, -0.06989827f},
			{-0.108959675f, 0.045132574f},
			{0.125f, -0.0f}},
		{{-0.005275603f, 0.005275603f},
			{0.008688525f, -0.020975955f},
			{2.5057372E-17f, 0.04546866f},
			{-0.027806213f, -0.06713013f},
			{0.06989827f, 0.06989827f},
			{-0.108959675f, -0.045132574f},
			{0.125f, -0.0f}},
		{{0.005275603f, 0.005275603f},
			{-0.020975955f, 0.008688525f},
			{-1.1139424E-16f, -0.04546866f},
			{0.06713013f, 0.027806213f},
			{-0.06989827f, 0.06989827f},
			{-0.045132574f, -0.108959675f},
			{0.125f, -0.0f}},
		{{0.005275603f, -0.005275603f},
			{0.020975955f, 0.008688525f},
			{-4.4574583E-17f, 0.04546866f},
			{-0.06713013f, 0.027806213f},
			{-0.06989827f, -0.06989827f},
			{0.045132574f, -0.108959675f},
			{0.125f, -0.0f}},
		{{-0.005275603f, -0.005275603f},
			{-0.008688525f, -0.020975955f},
			{-1.2253085E-16f, -0.04546866f},
			{0.027806213f, -0.06713013f},
			{0.06989827f, -0.06989827f},
			{0.108959675f, -0.045132574f},
			{0.125f, -0.0f}}
	};
	float[][][] FILTER_34_12 = {
		{{2.4990022E-18f, 0.0408118f},
			{0.009868281f, 0.036828928f},
			{0.025724541f, 0.04455621f},
			{0.04525364f, 0.04525364f},
			{0.064331084f, 0.03714157f},
			{0.07824335f, 0.020965243f},
			{0.083333336f, -0.0f}},
		{{-7.497006E-18f, -0.0408118f},
			{-0.026960645f, -0.026960645f},
			{-0.051449083f, 6.300696E-18f},
			{-0.04525364f, 0.04525364f},
			{4.5485305E-18f, 0.07428314f},
			{0.057278108f, 0.057278108f},
			{0.083333336f, -0.0f}},
		{{4.8743166E-17f, 0.0408118f},
			{0.036828928f, 0.009868281f},
			{0.025724541f, -0.04455621f},
			{-0.04525364f, -0.04525364f},
			{-0.064331084f, 0.03714157f},
			{0.020965243f, 0.07824335f},
			{0.083333336f, -0.0f}},
		{{-1.7493014E-17f, -0.0408118f},
			{-0.036828928f, 0.009868281f},
			{0.025724541f, 0.04455621f},
			{0.04525364f, -0.04525364f},
			{-0.064331084f, -0.03714157f},
			{-0.020965243f, 0.07824335f},
			{0.083333336f, -0.0f}},
		{{2.2491018E-17f, 0.0408118f},
			{0.026960645f, -0.026960645f},
			{-0.051449083f, 1.8902086E-17f},
			{0.04525364f, 0.04525364f},
			{-1.3645591E-17f, -0.07428314f},
			{-0.057278108f, 0.057278108f},
			{0.083333336f, -0.0f}},
		{{-9.998534E-17f, -0.0408118f},
			{-0.009868281f, 0.036828928f},
			{0.025724541f, -0.04455621f},
			{-0.04525364f, 0.04525364f},
			{0.064331084f, -0.03714157f},
			{-0.07824335f, 0.020965243f},
			{0.083333336f, -0.0f}},
		{{-4.0009294E-17f, 0.0408118f},
			{-0.009868281f, -0.036828928f},
			{0.025724541f, 0.04455621f},
			{-0.04525364f, -0.04525364f},
			{0.064331084f, 0.03714157f},
			{-0.07824335f, -0.020965243f},
			{0.083333336f, -0.0f}},
		{{-2.54974E-16f, -0.0408118f},
			{0.026960645f, 0.026960645f},
			{-0.051449083f, 1.228954E-16f},
			{0.04525364f, -0.04525364f},
			{8.871933E-17f, 0.07428314f},
			{-0.057278108f, -0.057278108f},
			{0.083333336f, -0.0f}},
		{{-1.7500593E-16f, 0.0408118f},
			{-0.036828928f, -0.009868281f},
			{0.025724541f, -0.04455621f},
			{0.04525364f, 0.04525364f},
			{-0.064331084f, 0.03714157f},
			{-0.020965243f, -0.07824335f},
			{0.083333336f, -0.0f}},
		{{-1.1997735E-16f, -0.0408118f},
			{0.036828928f, -0.009868281f},
			{0.025724541f, 0.04455621f},
			{-0.04525364f, 0.04525364f},
			{-0.064331084f, -0.03714157f},
			{0.020965243f, -0.07824335f},
			{0.083333336f, -0.0f}},
		{{-2.0017278E-17f, 0.0408118f},
			{-0.026960645f, 0.026960645f},
			{-0.051449083f, 4.410487E-17f},
			{-0.04525364f, -0.04525364f},
			{-3.1839714E-17f, -0.07428314f},
			{0.057278108f, -0.057278108f},
			{0.083333336f, -0.0f}},
		{{-1.2997337E-16f, -0.0408118f},
			{0.009868281f, -0.036828928f},
			{0.025724541f, -0.04455621f},
			{0.04525364f, -0.04525364f},
			{0.064331084f, -0.03714157f},
			{0.07824335f, -0.020965243f},
			{0.083333336f, -0.0f}}
	};
	float[][][] FILTER_34_8 = {
		{{-0.011070998f, 0.011070998f},
			{-0.014361023f, 0.034670576f},
			{3.3175017E-18f, 0.054178912f},
			{0.032210633f, 0.07776334f},
			{0.07288393f, 0.07288393f},
			{0.11292073f, 0.0467733f},
			{0.125f, -0.0f}},
		{{0.011070998f, 0.011070998f},
			{0.034670576f, -0.014361023f},
			{-9.952505E-18f, -0.054178912f},
			{-0.07776334f, -0.032210633f},
			{-0.07288393f, 0.07288393f},
			{0.0467733f, 0.11292073f},
			{0.125f, -0.0f}},
		{{0.011070998f, -0.011070998f},
			{-0.034670576f, -0.014361023f},
			{1.6587507E-17f, 0.054178912f},
			{0.07776334f, -0.032210633f},
			{-0.07288393f, -0.07288393f},
			{-0.0467733f, 0.11292073f},
			{0.125f, -0.0f}},
		{{-0.011070998f, -0.011070998f},
			{0.014361023f, 0.034670576f},
			{-2.3222512E-17f, -0.054178912f},
			{-0.032210633f, 0.07776334f},
			{0.07288393f, -0.07288393f},
			{-0.11292073f, 0.0467733f},
			{0.125f, -0.0f}},
		{{-0.011070998f, 0.011070998f},
			{0.014361023f, -0.034670576f},
			{2.9857514E-17f, 0.054178912f},
			{-0.032210633f, -0.07776334f},
			{0.07288393f, 0.07288393f},
			{-0.11292073f, -0.0467733f},
			{0.125f, -0.0f}},
		{{0.011070998f, 0.011070998f},
			{-0.034670576f, 0.014361023f},
			{-1.327336E-16f, -0.054178912f},
			{0.07776334f, 0.032210633f},
			{-0.07288393f, 0.07288393f},
			{-0.0467733f, -0.11292073f},
			{0.125f, -0.0f}},
		{{0.011070998f, -0.011070998f},
			{0.034670576f, 0.014361023f},
			{-5.311356E-17f, 0.054178912f},
			{-0.07776334f, 0.032210633f},
			{-0.07288393f, -0.07288393f},
			{0.0467733f, -0.11292073f},
			{0.125f, -0.0f}},
		{{-0.011070998f, -0.011070998f},
			{-0.014361023f, -0.034670576f},
			{-1.460036E-16f, -0.054178912f},
			{0.032210633f, -0.07776334f},
			{0.07288393f, -0.07288393f},
			{0.11292073f, -0.0467733f},
			{0.125f, -0.0f}}
	};
	float[][][] FILTER_34_4 = {
		{{1.0853208E-17f, 0.059082113f},
			{0.034446694f, 0.034446694f},
			{-0.0f, 0.0f},
			{-0.055003885f, 0.055003885f},
			{1.009495E-17f, 0.16486304f},
			{0.16461344f, 0.16461344f},
			{0.25f, -0.0f}},
		{{-3.2559626E-17f, -0.059082113f},
			{-0.034446694f, 0.034446694f},
			{-0.0f, 0.0f},
			{0.055003885f, 0.055003885f},
			{-3.0284846E-17f, -0.16486304f},
			{-0.16461344f, 0.16461344f},
			{0.25f, -0.0f}},
		{{1.5921696E-16f, 0.059082113f},
			{-0.034446694f, -0.034446694f},
			{-0.0f, 0.0f},
			{0.055003885f, -0.055003885f},
			{5.0474746E-17f, 0.16486304f},
			{-0.16461344f, -0.16461344f},
			{0.25f, -0.0f}},
		{{2.897846E-17f, -0.059082113f},
			{0.034446694f, -0.034446694f},
			{-0.0f, 0.0f},
			{-0.055003885f, -0.055003885f},
			{-7.066465E-17f, -0.16486304f},
			{0.16461344f, -0.16461344f},
			{0.25f, -0.0f}}
	};
}

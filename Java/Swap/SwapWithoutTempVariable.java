/*

Copyright 2020 Divya Garg

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

*/

public class SwapWithoutTempVariable {
	public static void main(String args[]){
		int a = 10;
		int b = 5;
		
		System.out.println("Before swapping : " + a + " " + b); // Before swapping : 10 5
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swapping : " + a + " " + b); // After swapping : 5 10
		
	}
}

 /*
  BeanUtils Version 1.0.0

  Created by yangtu222 on 2017.08.05

  Distributed under the permissive zlib License
  Get the latest version from here:

  https://github.com/yangtu222/BeanUtils

  This software is provided 'as-is', without any express or implied
  warranty.  In no event will the authors be held liable for any damages
  arising from the use of this software.

  Permission is granted to anyone to use this software for any purpose,
  including commercial applications, and to alter it and redistribute it
  freely, subject to the following restrictions:

  1. The origin of this software must not be misrepresented; you must not
  claim that you wrote the original software. If you use this software
  in a product, an acknowledgment in the product documentation would be
  appreciated but is not required.

  2. Altered source versions must be plainly marked as such, and must not be
  misrepresented as being the original software.

  3. This notice may not be removed or altered from any source distribution.
*/

package com.tuyang.beanutils.internal.cache;

import java.lang.reflect.Method;

import com.tuyang.beanutils.BeanCopyConvertor;

public class BeanCopyPropertyItem {

	public Method[] readMethods = null;
	public Method writeMethod = null;
	
	public boolean isCollection = false;
	public boolean useBeanCopy = false;

	public Class<?> collectionClass = null;
	public Class<?> optionClass = null;
	
	public Class<?> convertorClass = null;
	@SuppressWarnings("rawtypes")
	public BeanCopyConvertor convertorObject = null;
	
}

/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package eagle.jfaster.org.exception;

/**
 * 控制台异常.
 *
 * @author fangyanpeng
 */
public final class ServiceConsoleException extends RuntimeException {
    
    private static final long serialVersionUID = 1393957353478034407L;
    
    public ServiceConsoleException(final Exception cause) {
        super(cause);
    }
}
/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 Maxim Roncacé
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package net.caseif.flint.api;

/**
 * The core class for the Flint framework.
 *
 * @author Max Roncacé
 * @version 0.1.0-SNAPSHOT
 * @since 0.1.0
 */
public abstract class FlintCore {

    protected static FlintCore INSTANCE;

    /**
     * Gets the primary instance of this class.
     *
     * @return The primary instance of this class
     * @since 0.1.0
     */
    public static FlintCore getInstance() {
        return INSTANCE;
    }

    /**
     * Registers a plugin as a Flint-backed {@link Minigame}.
     *
     * @param pluginId The name or ID of the plugin to register
     * @return The newly created {@link Minigame} associated with the plugin
     * @since 0.1.0
     */
    public abstract Minigame registerPlugin(String pluginId);

}

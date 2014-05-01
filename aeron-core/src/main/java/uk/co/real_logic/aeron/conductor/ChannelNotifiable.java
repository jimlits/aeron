/*
 * Copyright 2014 Real Logic Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.real_logic.aeron.conductor;

public abstract class ChannelNotifiable
{
    protected final TermBufferNotifier bufferNotifier;
    protected final String destination;
    protected final long channelId;

    public ChannelNotifiable(final TermBufferNotifier bufferNotifier, final String destination, final long channelId)
    {
        this.bufferNotifier = bufferNotifier;
        this.destination = destination;
        this.channelId = channelId;
    }

    protected abstract boolean hasTerm(final long sessionId);

    public abstract void initialTerm(final long sessionId, final long termId);

    //public abstract void cleanedTermBuffer(long sessionId, long termId);

}

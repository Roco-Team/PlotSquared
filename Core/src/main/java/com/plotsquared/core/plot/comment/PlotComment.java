/*
 * PlotSquared, a land and world management plugin for Minecraft.
 * Copyright (C) IntellectualSites <https://intellectualsites.com>
 * Copyright (C) IntellectualSites team and contributors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.plotsquared.core.plot.comment;

import com.plotsquared.core.plot.PlotId;

public class PlotComment {

    public final String comment;
    public final String inbox;
    public final String senderName;
    public final PlotId id;
    public final String world;
    public final long timestamp;

    public PlotComment(
            String world, PlotId id, String comment, String senderName, String inbox,
            long timestamp
    ) {
        this.world = world;
        this.id = id;
        this.comment = comment;
        this.senderName = senderName;
        this.inbox = inbox;
        this.timestamp = timestamp;
    }

}

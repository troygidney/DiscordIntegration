package DiscordIntegration.ServerCommands;

import DiscordIntegration.Main;
import net.dv8tion.jda.core.JDA;
import org.spongepowered.api.command.CommandException;
import org.spongepowered.api.command.CommandResult;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.command.args.CommandContext;
import org.spongepowered.api.command.spec.CommandExecutor;
import org.spongepowered.api.text.Text;

public class GlobalCommand implements CommandExecutor {
    @Override
    public CommandResult execute(CommandSource src, CommandContext args) throws CommandException {
        String cmd = args.getOne(Text.of("command")).get().toString();
        JDA jda = Main.jda;
        jda.getGuildsByName("Pixelmon+", true).get(0).getTextChannelsByName("staff-logs", true).get(0).sendMessage("!gcmd " + cmd).submit();

        return CommandResult.success();
    }
}
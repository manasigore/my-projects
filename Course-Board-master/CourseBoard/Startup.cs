using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(MessageBoardApp.Startup))]
namespace MessageBoardApp
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}

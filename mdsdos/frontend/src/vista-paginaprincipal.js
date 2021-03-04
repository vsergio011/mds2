import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import 'http://localhost:51744/files/transformed/node_modules/@vaadin/vaadin-button/theme/lumo/vaadin-button.js';
import 'http://localhost:51744/files/transformed/node_modules/@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import 'http://localhost:51744/files/transformed/node_modules/@vaadin/vaadin-button/theme/lumo/vaadin-button.js';" tabindex="0" role="button" draggable="true" vaadin-dnd-layout-item="true" active="" focused="" style="height: 50%;
import 'http://localhost:51744/files/transformed/node_modules/@vaadin/vaadin-button/theme/lumo/vaadin-button.js';" tabindex="0" role="button" draggable="true" vaadin-dnd-layout-item="true" active="" focused="" style="height: 50%; width: 20%;
import 'http://localhost:51744/files/transformed/node_modules/@vaadin/vaadin-button/theme/lumo/vaadin-button.js';" tabindex="0" role="button" draggable="true" vaadin-dnd-layout-item="true" active="" focused="" style="height: 50%; width: 20%; align-self: flex-start;
import 'http://localhost:51744/files/transformed/node_modules/@vaadin/vaadin-button/theme/lumo/vaadin-button.js';" tabindex="0" role="button" draggable="true" vaadin-dnd-layout-item="true" active="" focused="" style="height: 50%; width: 20%; align-self: center;

class VistaPaginaprincipal extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-l);">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 30%; padding: var(--lumo-space-l);">
  <vaadin-button style="align-self: center;">
   Ofertas 
  </vaadin-button>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 100%; align-self: center; justify-content: center;">
   <img style="width: 12%; height: 100%; flex-grow: 0;">
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing" style="height: 30%; width: 100%;">
  <label style="font-weight: bold; align-self: flex-start;">Categoria 1 </label>
  <vaadin-vertical-layout theme="spacing" style="height: 100%; width: 30%;">
   <img style="width: 80%; height: 80%; flex-grow: 0; align-self: center;">
   <vaadin-horizontal-layout theme="spacing" style="width: 80%; align-self: center;">
    <label style="align-self: flex-start; font-size: 13px; flex-grow: 0; width: 70%;">Titulo </label>
    <vaadin-button theme="icon" aria-label="Add new" _vaadin_designer_import_href="import 'http://localhost:51744/files/transformed/node_modules/@vaadin/vaadin-button/theme/lumo/vaadin-button.js';" tabindex="0" role="button" draggable="true" vaadin-dnd-layout-item="true" active="" focused="" style="height: 50%; width: 20%; align-self: flex-start;">
     <iron-icon icon="lumo:plus" _vaadin_designer_import_href="import 'http://localhost:51744/files/transformed/node_modules/@polymer/iron-icon/iron-icon.js';"></iron-icon>
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-paginaprincipal';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPaginaprincipal.is, VistaPaginaprincipal);
